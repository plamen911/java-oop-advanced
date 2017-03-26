package _04EnumerationsAndAnnotationsExercises._07DeckOfCards;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Plamen Markov on 3/26/17.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Enumeration {
    String category();

    String description();
}
