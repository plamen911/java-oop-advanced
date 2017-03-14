package _01InterfacesAndAbstractionLab._04SayHello;

/**
 * Created by Plamen Markov on 3/15/17.
 */
public interface Person {
    String getName();

    default String sayHello() {
        return "Hello";
    }
}
