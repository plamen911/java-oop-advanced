package _02GenericsLab._02GenericArrayCreator;

import java.lang.reflect.Array;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public class ArrayCreator {

    @SuppressWarnings("unchecked")
    public static <T> T[] create(int length, T item) {
        T[] elements = (T[]) new Object[length];
        for (int i = 0; i < length; i++) {
            elements[i] = item;
        }
        return elements;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] create(Class<T> cl, int length, T item) {
        T[] elements = (T[]) Array.newInstance(cl, length);
        for (int i = 0; i < length; i++) {
            elements[i] = item;
        }
        return elements;
    }

//
}
