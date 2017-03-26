package _04EnumerationsAndAnnotationsExercises._08CardGame;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public class Card implements Comparable<Card> {
    private Rank cardRank;
    private Suit cardSuit;

    public Card(String cardRank, String cardSuit) {
        try {
            this.cardRank = Rank.valueOf(cardRank);
            this.cardSuit = Suit.valueOf(cardSuit);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("No such card exists.");
        }
    }

    public int getPower() {
        return this.cardRank.getPower() + this.cardSuit.getPower();
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.cardRank.name(), this.cardSuit.name());
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.getPower(), o.getPower());
    }
}
