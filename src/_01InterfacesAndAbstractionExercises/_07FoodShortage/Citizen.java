package _01InterfacesAndAbstractionExercises._07FoodShortage;

/**
 * Created by Plamen Markov on 3/17/17.
 */
public class Citizen implements Visitor, Birthable, Buyer {
    private static final int FOOD_INCREASE = 10;

    private String id;
    private String name;
    private int age;
    private String birthday;
    private int food;

    public Citizen(String id, String name, int age, String birthday) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.setBirthday(birthday);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }

    @Override
    public void buyFood() {
        this.food += FOOD_INCREASE;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
