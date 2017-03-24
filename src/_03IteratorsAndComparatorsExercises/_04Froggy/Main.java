// https://judge.softuni.bg/Contests/Practice/Index/254#3
package _03IteratorsAndComparatorsExercises._04Froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Plamen Markov on 3/24/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] tokens = Arrays.stream(reader.readLine().split(", | "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        Lake lake = new Lake(tokens);

        String end = reader.readLine();

        StringBuilder sb = new StringBuilder();
        for (Integer integer : lake) {
            sb.append(integer).append(", ");
        }
        String result = sb.toString();
        System.out.println(result.substring(0, result.length() - 2));
    }
}
