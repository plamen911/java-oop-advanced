// https://judge.softuni.bg/Contests/Practice/Index/254#5
package _03IteratorsAndComparatorsExercises._06StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Plamen Markov on 3/24/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Set<Person> nameComparedPerson = new TreeSet<>(new NameComparator());
        Set<Person> ageComparedPerson = new TreeSet<>(new AgeComparator());

        for (int i = 0; i < n; i++) {
            String[] personTokens = reader.readLine().split("\\s+");
            Person p = new PersonImpl(personTokens[0], Integer.parseInt(personTokens[1]));
            nameComparedPerson.add(p);
            ageComparedPerson.add(p);
        }

        nameComparedPerson.forEach(System.out::println);
        ageComparedPerson.forEach(System.out::println);
    }
}
