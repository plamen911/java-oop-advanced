package _04EnumerationsAndAnnotationsLab._03CoffeeMachine;

/**
 * Created by Plamen Markov on 3/25/17.
 */
public class Coffee {
    private CoffeeSize size;
    private CoffeeType type;

    public Coffee(String size, String type) {
        this.size = CoffeeSize.valueOf(size.toUpperCase());
        this.type = CoffeeType.valueOf(type.toUpperCase());
    }

    public int getPrice() {
        return this.size.getCoins();
    }
}
