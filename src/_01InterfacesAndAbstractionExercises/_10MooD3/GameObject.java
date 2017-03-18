package _01InterfacesAndAbstractionExercises._10MooD3;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public interface GameObject<E, P> {

    String getUsername();

    E getHashedPassword();

    int getLevel();

    P getSpecialPoints();

    P getSpecialResult();

    void setHashedPassword(E element);

    void hashPassword();

}
