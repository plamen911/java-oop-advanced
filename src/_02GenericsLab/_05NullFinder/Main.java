// https://judge.softuni.bg/Contests/Practice/Index/521#4
package _02GenericsLab._05NullFinder;

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

        List<Integer> integerNulls = ListUtils.getNullIndices(integers);

        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "a", null, "c");
        List<Integer> stringNulls = ListUtils.getNullIndices(strings);
    }
}
