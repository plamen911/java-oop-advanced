package _03IteratorsAndComparatorsExercises._03StackIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Plamen Markov on 3/24/17.
 */
public class Stack implements Iterable<Integer> {
    private List<Integer> data;

    public Stack() {
        this.data = new ArrayList<>();
    }

    public void push(Integer... elements) {
        this.data.addAll(Arrays.asList(elements));
    }

    public Integer pop() {
        if (this.data.size() <= 0) {
            throw new IllegalStateException("No elements");
        }
        return this.data.remove(this.data.size() - 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new CustomIterator();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        while (this.iterator().hasNext()) {
            action.accept(this.iterator().next());
        }
    }

    private final class CustomIterator implements Iterator<Integer> {
        private int counter;

        CustomIterator() {
            this.counter = data.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return this.counter >= 0;
        }

        @Override
        public Integer next() {
            return data.get(this.counter--);
        }
    }
}
