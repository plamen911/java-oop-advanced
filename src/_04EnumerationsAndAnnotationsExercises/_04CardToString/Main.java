// https://judge.softuni.bg/Contests/Practice/Index/251#3
package _04EnumerationsAndAnnotationsExercises._04CardToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String cardRank = reader.readLine().trim();
        String cardSuit = reader.readLine().trim();

        Card card = new Card(cardRank, cardSuit);
        System.out.printf("%s", card);
    }
}
