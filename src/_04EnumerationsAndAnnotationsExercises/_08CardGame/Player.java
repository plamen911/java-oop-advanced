package _04EnumerationsAndAnnotationsExercises._08CardGame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public class Player {
    private static final int MAX_CARDS_IN_DECK = 5;
    private String name;
    private List<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        for (Card card1 : this.cards) {
            if (card.compareTo(card1) == 0) {
                throw new IllegalArgumentException("Card is not in the deck.");
            }
        }

        if (this.cards.size() < MAX_CARDS_IN_DECK) {
            this.cards.add(card);
        }
    }

    public Card getHighestPoweredCard() {
        if (this.cards.isEmpty()) {
            return null;
        }

        Card highestPoweredCard = this.cards.get(0);
        for (Card card : this.cards) {
            if (highestPoweredCard.compareTo(card) < 0) {
                highestPoweredCard = card;
            }
        }

        return highestPoweredCard;
    }

    @Override
    public String toString() {
        return String.format("%s wins with %s.", this.name, this.getHighestPoweredCard());
    }
}
