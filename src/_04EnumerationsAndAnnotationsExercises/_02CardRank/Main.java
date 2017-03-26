// https://judge.softuni.bg/Contests/Practice/Index/251#1
package _04EnumerationsAndAnnotationsExercises._02CardRank;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        for (CardRanks cardRanks : CardRanks.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardRanks.ordinal(), cardRanks);
        }
    }
}
