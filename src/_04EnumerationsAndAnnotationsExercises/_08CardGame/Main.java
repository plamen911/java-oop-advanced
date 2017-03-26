// https://judge.softuni.bg/Contests/Practice/Index/251#7
package _04EnumerationsAndAnnotationsExercises._08CardGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String player1Name = reader.readLine().trim();
        String player2Name = reader.readLine().trim();

        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);
        Card card = null;

        int totalCardsShouldReceive = 10;
        while (totalCardsShouldReceive > 0) {
            String[] tokens = reader.readLine().trim().split("\\s+");
            try {
                card = new Card(tokens[0], tokens[2]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }

            try {
                if (totalCardsShouldReceive > 5) {
                    player1.addCard(card);
                } else {
                    player2.addCard(card);
                }

                totalCardsShouldReceive--;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        Card player1HighestCard = player1.getHighestPoweredCard();
        Card player2HighestCard = player2.getHighestPoweredCard();
        if (player1HighestCard.compareTo(player2HighestCard) > 0) {
            System.out.println(player1);
        } else {
            System.out.println(player2);
        }
    }
}
