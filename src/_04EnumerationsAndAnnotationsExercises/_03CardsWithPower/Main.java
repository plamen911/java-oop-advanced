// https://judge.softuni.bg/Contests/Practice/Index/251#2
package _04EnumerationsAndAnnotationsExercises._03CardsWithPower;

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

        System.out.printf("Card name: %s of %s; Card power: %d",
                CardRanks.valueOf(cardRank), CardSuits.valueOf(cardSuit),
                Enum.valueOf(CardRanks.class, cardRank).getPower() + Enum.valueOf(CardSuits.class, cardSuit).getPower()
                );
    }
}
