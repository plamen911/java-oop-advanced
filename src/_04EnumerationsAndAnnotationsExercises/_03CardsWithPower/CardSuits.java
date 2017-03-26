package _04EnumerationsAndAnnotationsExercises._03CardsWithPower;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public enum CardSuits {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int power;

    CardSuits(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }
}
