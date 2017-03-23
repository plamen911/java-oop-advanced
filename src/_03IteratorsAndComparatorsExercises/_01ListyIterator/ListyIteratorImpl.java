package _03IteratorsAndComparatorsExercises._01ListyIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Plamen Markov on 3/23/17.
 */
public class ListyIteratorImpl<T> implements ListyIterator<T>, Iterable<T> {
    private List<T> data;
    private int index;

    public ListyIteratorImpl(T... items) {
        this.index = 0;
        this.data = Arrays.asList(items);
    }

    @Override
    public boolean move() {
        if (this.iterator().hasNext()) {
            this.iterator().next();
            return true;
        }
        return false;
    }

    @Override
    public boolean hasNext() {
        return this.iterator().hasNext();
    }

    @Override
    public void print() {
        if (!this.data.isEmpty()) {
        // if (this.iterator().hasNext()) {
            System.out.println(this.data.get(this.index));
        } else {
            throw new UnsupportedOperationException("Invalid Operation!");
        }
    }

    @Override
    public Iterator<T> iterator() {
        // return this.data.iterator();
        return new ListyIteratorInner();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        while (this.iterator().hasNext()) {
            action.accept(this.iterator().next());
        }
    }

    private final class ListyIteratorInner implements Iterator<T> {
        @Override
        public boolean hasNext() {
            return index < data.size() - 1;
        }

        @Override
        public T next() {
            return data.get(index++);
        }
    }
}
