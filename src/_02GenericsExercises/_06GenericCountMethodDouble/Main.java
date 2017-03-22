// https://judge.softuni.bg/Contests/Practice/Index/247#5
package _02GenericsExercises._06GenericCountMethodDouble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Plamen Markov on 3/22/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        List<Box<Double>> boxes = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            Box<Double> box = new Box<>(Double.parseDouble(reader.readLine()));
            boxes.add(box);
        }
        Box<Double> element = new Box<>(Double.parseDouble(reader.readLine()));
        System.out.println(getCount(boxes, element));
    }

    public static <T> void swap(List<T> list, int firstIndex, int secondIndex) {
        T firstElement = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, firstElement);
    }

    private static <T extends Comparable<T>> Integer getCount(List<T> list, T element) {
        int count = 0;
        for (T currentElement : list) {
            if (currentElement.compareTo(element) > 0) {
                count++;
            }
        }

        return count;
    }
}
