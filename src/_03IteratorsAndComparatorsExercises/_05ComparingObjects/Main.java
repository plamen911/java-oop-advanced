// https://judge.softuni.bg/Contests/Practice/Index/254#4
package _03IteratorsAndComparatorsExercises._05ComparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Plamen Markov on 3/25/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();
        String line;
        while (!"END".equals(line = reader.readLine())) {
            String[] tokens = line.split("\\s+");
            people.add(new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
        }
        int n = Integer.parseInt(reader.readLine());
        if (n < 0 || n >= people.size()) {
            System.out.println("No matches");
        } else {
            int numEqual = 0;
            int numNotEqual = 0;
            Person currentPerson = people.get(n);
            for (Person person : people) {
                if (person.compareTo(currentPerson) == 0) {
                    numEqual++;
                } else {
                    numNotEqual++;
                }
            }
            System.out.printf("%d %d %d", numEqual, numNotEqual, people.size());
        }
    }
}
