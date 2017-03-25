// https://judge.softuni.bg/Contests/Practice/Index/254#6
package _03IteratorsAndComparatorsExercises._07EqualityLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Plamen Markov on 3/25/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Person> peopleTreeSet = new TreeSet<>();
        Set<Person> peopleHashSet = new HashSet<>();
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().trim().split("\\s+");
            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));
            peopleTreeSet.add(person);
            peopleHashSet.add(person);
        }

        System.out.println(peopleTreeSet.size());
        System.out.println(peopleHashSet.size());
    }
}
