// https://judge.softuni.bg/Contests/Practice/Index/521#5
package _02GenericsLab._06GenericFlatMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 3);

        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles, 1.2, 2.3);

        List<List<? extends Number>> jagged = new ArrayList<>();
        Collections.addAll(jagged, integers, doubles);

        List<Number> dest = new ArrayList<>();
        ListUtils.flatten(dest, jagged);
    }
}
