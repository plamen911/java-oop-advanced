package _02GenericsLab._07GenericAddAllMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public class ListUtils {
    public static <T> void addAll(List<? super T> destination, List<? extends T> source) {
        destination.addAll(source);
    }

    public static <T> void flatten(List<? super T> destination, List<List<? extends T>> source) {
        for (List<? extends T> objects : source) {
            destination.addAll(objects);
        }
    }

    public static List<Integer> getNullIndices(List<?> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Empty list.");
        }

        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                indexes.add(i);
            }
        }

        return indexes;
    }

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Empty list.");
        }

        T min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0) {
                min = list.get(i);
            }
        }

        return min;
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Empty list.");
        }

        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max.compareTo(list.get(i)) < 0) {
                max = list.get(i);
            }
        }

        return max;
    }
}
