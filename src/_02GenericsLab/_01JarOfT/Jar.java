package _02GenericsLab._01JarOfT;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public class Jar<T> {
    private Deque<T> elements;

    public Jar() {
        this.elements = new ArrayDeque<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public T remove() {
        return this.elements.pop();
    }
}
