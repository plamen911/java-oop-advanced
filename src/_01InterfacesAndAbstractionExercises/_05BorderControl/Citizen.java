package _01InterfacesAndAbstractionExercises._05BorderControl;

/**
 * Created by Plamen Markov on 3/17/17.
 */
public class Citizen implements Visitor {
    private String id;
    private String name;
    private int age;

    public Citizen(String id, String name, int age) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public String getId() {
        return null;
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
}
