package _02GenericsExercises._01GenericBox;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public class Box<T> {
    private T data;

    public Box(T data) {
        this.setData(data);
    }

    @Override
    public String toString() {
        return this.data.getClass().getTypeName() + ": " + this.data.toString();
    }

    private void setData(T data) {
        this.data = data;
    }
}
