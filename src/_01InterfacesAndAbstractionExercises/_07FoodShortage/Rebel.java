package _01InterfacesAndAbstractionExercises._07FoodShortage;

/**
 * Created by Plamen Markov on 3/17/17.
 */
public class Rebel implements Buyer {
    private static final int FOOD_INCREASE = 5;

    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.setName(name);
        this.setAge(age);
        this.setGroup(group);
    }

    @Override
    public void buyFood() {
        this.food += FOOD_INCREASE;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setGroup(String group) {
        this.group = group;
    }
}
