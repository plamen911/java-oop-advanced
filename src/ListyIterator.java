/**
 * Created by Plamen Markov on 3/23/17.
 */
public interface ListyIterator<T> extends Iterable<T> {

    boolean move();

    boolean hasNext();

    void print();

    void printAll();
}
