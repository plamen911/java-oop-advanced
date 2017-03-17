// https://judge.softuni.bg/Contests/Practice/Index/246#4
package _01InterfacesAndAbstractionExercises._05BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Plamen Markov on 3/17/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Visitor> visitors = new LinkedHashMap<>();
        String line;
        while (!"End".equals(line = reader.readLine().trim())) {
            String[] tokens = line.split("\\s+");
            if (tokens.length < 3) {
                String model = tokens[0];
                String id = tokens[1];
                visitors.putIfAbsent(id, new Robot(id, model));
            } else {
                String name = tokens[0];
                int age = Integer.valueOf(tokens[1]);
                String id = tokens[2];
                visitors.putIfAbsent(id, new Citizen(id, name, age));
            }
        }
        String idSuffix = reader.readLine().trim();
        visitors.entrySet().stream()
                .filter(a -> a.getKey().endsWith(idSuffix))
                .forEach((Map.Entry<String, Visitor> v) -> System.out.println(v.getKey()));
    }
}
