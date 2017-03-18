package _02GenericsLab._03GenericScale;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.setLeft(left);
        this.setRight(right);
    }

    public T getHeavier() {
        if (this.getLeft().compareTo(this.getRight()) == 0) {
            return null;
        }
        return (this.getLeft().compareTo(this.getRight()) > 0) ? this.getLeft() : this.getRight();
    }

    private T getLeft() {
        return left;
    }

    private T getRight() {
        return right;
    }

    private void setLeft(T left) {
        this.left = left;
    }

    private void setRight(T right) {
        this.right = right;
    }
}
