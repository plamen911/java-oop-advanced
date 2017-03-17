// https://judge.softuni.bg/Contests/Practice/Index/246#5
package _01InterfacesAndAbstractionExercises._06BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Plamen Markov on 3/17/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Birthday> birthdays = new LinkedList<>();
        String line;
        String name;
        String birthday;
        while (!"End".equals(line = reader.readLine().trim())) {
            String[] tokens = line.split("\\s+");
            switch (tokens[0]) {
                case "Citizen":
                    name = tokens[1];
                    int age = Integer.valueOf(tokens[2]);
                    String id = tokens[3];
                    birthday = tokens[4];
                    birthdays.add(new Citizen(id, name, age, birthday));
                    break;

                case "Pet":
                    name = tokens[1];
                    birthday = tokens[2];
                    birthdays.add(new Pet(name, birthday));
                    break;

            }
        }
        String year = reader.readLine().trim();
        birthdays.stream()
                .filter(a -> a.getBirthday().endsWith(year))
                .forEach(b -> System.out.println(b.getBirthday()));
    }
}
