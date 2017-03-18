// https://judge.softuni.bg/Contests/Practice/Index/247#0
package _02GenericsExercises._01GenericBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            Box box = new Box(reader.readLine());
            System.out.println(box);
        }
    }
}
