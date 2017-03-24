package _03IteratorsAndComparatorsExercises._01ListyIterator;

import java.util.List;

/**
 * Created by Plamen Markov on 3/23/17.
 */
public interface ListyIterator<T> extends Iterable<T> {

    boolean move();

    boolean hasNext();

    void print();
}
