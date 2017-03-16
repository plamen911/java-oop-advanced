package _01InterfacesAndAbstractionExercises._04Тelephony;

/**
 * Created by Plamen Markov on 3/16/17.
 */
public interface Browseable {
    String urlRegex = "[0-9]+";

    void browse(String siteUrl);
}
