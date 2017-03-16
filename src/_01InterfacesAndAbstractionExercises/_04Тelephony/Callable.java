package _01InterfacesAndAbstractionExercises._04Тelephony;

/**
 * Created by Plamen Markov on 3/16/17.
 */
public interface Callable {
    String phoneRegex = "[^0-9]+";

    void call(String phoneNumber);
}
