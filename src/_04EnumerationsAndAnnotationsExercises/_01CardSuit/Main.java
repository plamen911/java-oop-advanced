// https://judge.softuni.bg/Contests/Practice/Index/251#0
package _04EnumerationsAndAnnotationsExercises._01CardSuit;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        for (CardSuits cardSuits : CardSuits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuits.ordinal(), cardSuits);
        }
    }
}
