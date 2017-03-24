package _03IteratorsAndComparatorsExercises._04Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Plamen Markov on 3/24/17.
 */
public class Lake implements Iterable<Integer> {
    private List<Integer> data;

    public Lake(Integer[] data) {
        this.data = Arrays.asList(data);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        while (this.iterator().hasNext()) {
            action.accept(this.iterator().next());
        }
    }

    private final class Frog implements Iterator<Integer> {
        private int counter;

        private Frog() {
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return this.counter < data.size();
        }

        @Override
        public Integer next() {
            this.counter += 2;
            int element = data.get(this.counter - 2);
            if (this.counter % 2 == 0 && this.counter >= data.size()) {
                this.counter = 1;
            }
            return element;
        }
    }
}
