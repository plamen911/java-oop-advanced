// https://judge.softuni.bg/Contests/Practice/Index/521#2
package _02GenericsLab._03GenericScale;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public class Main {
    public static void main(String[] args) {
        Scale<String> stringScale = new Scale<>("a", "c");
        System.out.println(stringScale.getHeavier());

        Scale<Integer> integerScale = new Scale<>(1, 2);
        System.out.println(integerScale.getHeavier());
    }
}
