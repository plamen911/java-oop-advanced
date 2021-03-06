package _04EnumerationsAndAnnotationsExercises._05CardCompareTo;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public enum Rank {
    ACE(14), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

    private int power;

    Rank(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }
}
