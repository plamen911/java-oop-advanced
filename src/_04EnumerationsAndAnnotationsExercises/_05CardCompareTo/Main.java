// https://judge.softuni.bg/Contests/Practice/Index/251#4
package _04EnumerationsAndAnnotationsExercises._05CardCompareTo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String cardRank1 = reader.readLine().trim();
        String cardSuit1 = reader.readLine().trim();
        Card card1 = new Card(cardRank1, cardSuit1);

        String cardRank2 = reader.readLine().trim();
        String cardSuit2 = reader.readLine().trim();
        Card card2 = new Card(cardRank2, cardSuit2);

        if (card1.compareTo(card2) > 0) {
            System.out.printf("%s", card1);
        } else {
            System.out.printf("%s", card2);
        }

    }
}
