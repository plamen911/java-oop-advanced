package _01InterfacesAndAbstractionExercises._01DefineAnInterfacePerson;

/**
 * Created by Plamen Markov on 3/14/17.
 */
public class Citizen implements Person {
    private String name;
    private int age;

    public Citizen(String name, int age) {
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
}
