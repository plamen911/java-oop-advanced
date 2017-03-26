package _04EnumerationsAndAnnotationsExercises._08CardGame;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public class Deck {
    private Map<String, Card> allCards;

    public Deck() {
        this.allCards = new HashMap<>();
        this.initializeCards();
    }

    public Card getCard(String name) {
        if (!this.allCards.containsKey(name)) {
            throw new IllegalArgumentException("No such card exists.");
        }
        if (this.allCards.get(name) == null) {
            throw new IllegalStateException("Card is not in the deck.");
        }
        Card card = this.allCards.get(name);
        this.allCards.put(name, null);

        return card;
    }

    private void initializeCards() {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank, suit);
                this.allCards.putIfAbsent(card.getName(), card);
            }
        }
    }
}
