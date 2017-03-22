package _02GenericsExercises._05GenericCountMethodString;


/**
 * Created by Plamen Markov on 3/18/17.
 */
public class Box<T extends Comparable<T>> implements Comparable<Box<T>> {

    private T data;

    public Box(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.getClass().getName() + ": " + data;
    }

    public T getData() {
        return data;
    }

    @Override
    public int compareTo(Box<T> box) {
        return this.data.compareTo(box.getData());
    }
}
