// https://judge.softuni.bg/Contests/Practice/Index/521#3
package _02GenericsLab._04ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 18, 2, -1);

        Integer maxInteger = ListUtils.getMax(integers);

        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "a", "b", "c");

        String minString = ListUtils.getMin(strings);
    }
}
