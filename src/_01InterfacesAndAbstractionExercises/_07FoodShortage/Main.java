// https://judge.softuni.bg/Contests/Practice/Index/246#6
package _01InterfacesAndAbstractionExercises._07FoodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Plamen Markov on 3/17/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Buyer> people = new LinkedHashMap<>();

        String name;
        int age;
        String id;
        String birthdate;
        String group;

        int n = Integer.valueOf(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] params = reader.readLine().trim().split("\\s+");
            if (params.length == 4) {
                name = params[0];
                age = Integer.parseInt(params[1]);
                id = params[2];
                birthdate = params[3];
                people.putIfAbsent(params[0], new Citizen(id, name, age, birthdate));
            } else {
                name = params[0];
                age = Integer.parseInt(params[1]);
                group = params[2];
                people.putIfAbsent(params[0], new Rebel(name, age, group));
            }
        }

        String line;
        while (!"End".equals(line = reader.readLine())) {
            if (people.containsKey(line)) {
                people.get(line).buyFood();
            }
        }

        System.out.println(people.values().stream().mapToInt(Buyer::getFood).sum());
    }
}
