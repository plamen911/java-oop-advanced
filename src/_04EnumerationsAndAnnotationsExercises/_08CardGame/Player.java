package _04EnumerationsAndAnnotationsExercises._08CardGame;

import java.util.*;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public class Player {
    private String name;
    private Set<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new TreeSet<>();

    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public int getSize() {
        return this.hand.size();
    }

    public Card getHighestCard() {
        return this.hand.stream().sorted(Collections.reverseOrder()).findFirst().orElse(null);
    }

    public String getName() {
        return this.name;
    }
}
