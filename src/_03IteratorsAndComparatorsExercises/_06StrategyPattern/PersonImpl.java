package _03IteratorsAndComparatorsExercises._06StrategyPattern;

/**
 * Created by Plamen Markov on 3/24/17.
 */
public class PersonImpl implements Person {
    private String name;
    private int age;

    public PersonImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.getAge();
    }
}
