package _04EnumerationsAndAnnotationsLab._03CoffeeMachine;

/**
 * Created by Plamen Markov on 3/25/17.
 */
public enum CoffeeSize {
    SMALL(50, 50), NORMAL(100, 75), DOUBLE(200, 100);

    private int dosage;
    private int coins;

    CoffeeSize(int dosage, int coins) {
        this.dosage = dosage;
        this.coins = coins;
    }

    public int getCoins() {
        return this.coins;
    }
}
