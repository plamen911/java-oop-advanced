package _04EnumerationsAndAnnotationsExercises._08CardGame;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public class Card implements Comparable<Card> {
    private Rank rank;
    private Suit suit;
    private String name;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.setName();
    }

    public String getName() {
        return this.name;
    }

    private void setName() {
        this.name = String.format("%s of %s", this.rank.name(), this.suit.name());
    }

    public int getPower() {
        return this.rank.getPower() + this.suit.getPower();
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.rank.name(), this.suit.name());
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.getPower(), o.getPower());
    }
}
