// https://judge.softuni.bg/Contests/Practice/Index/521#1
package _02GenericsLab._02GenericArrayCreator;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public class Main {
    public static void main(String[] args) {
        String[] strings = ArrayCreator.create(10, "none");
        Integer[] integers = ArrayCreator.create(Integer.class, 10, 0);
    }
}
