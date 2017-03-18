// https://judge.softuni.bg/Contests/Practice/Index/521#6
package _02GenericsLab._07GenericAddAllMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, null, 2, null);

        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles, 1.2, 3.2, 5.5);

        List<Number> destination = new ArrayList<>();

        ListUtils.addAll(destination, integers);
        ListUtils.addAll(destination, doubles);

        String debug = "";
    }
}
