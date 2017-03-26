package _04EnumerationsAndAnnotationsExercises._05CardCompareTo;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public enum Suit {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int power;

    Suit(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }
}
