package _04EnumerationsAndAnnotationsExercises._04CardToString;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public class Card {
    private CardRanks cardRank;
    private CardSuits cardSuit;

    public Card(String cardRank, String cardSuit) {
        this.cardRank = CardRanks.valueOf(cardRank);
        this.cardSuit = CardSuits.valueOf(cardSuit);
    }

    public int getPower() {
        return this.cardRank.getPower() + this.cardSuit.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.cardRank.name(), this.cardSuit.name(), this.getPower());
    }
}
