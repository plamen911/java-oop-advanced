// https://judge.softuni.bg/Contests/Practice/Index/251#6
package _04EnumerationsAndAnnotationsExercises._07DeckOfCards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                System.out.printf("%s of %s%n", rank.name(), suit.name());
            }
        }
    }
}
