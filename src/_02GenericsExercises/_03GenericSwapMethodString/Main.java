// https://judge.softuni.bg/Contests/Practice/Index/247#2
package _02GenericsExercises._03GenericSwapMethodString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public class Main {
    public static <E> void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<E> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add((E) reader.readLine());
        }

        String[] indexes = reader.readLine().split("\\s+");

        swap(list, Integer.parseInt(indexes[0]), Integer.parseInt(indexes[1]));

        for (E e : list) {
            System.out.println(e.getClass().getTypeName() + ": " + e);
        }
    }

    private static <E> void swap(List<E> list, int index1, int index2) {
        E tmp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, tmp);
    }
}
