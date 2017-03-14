package _01InterfacesAndAbstractionLab._04SayHello;

/**
 * Created by Plamen Markov on 3/15/17.
 */
public class European implements Person {
    private String name;

    public European(String name) {
        this.setName(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }

    private void setName(String name) {
        this.name = name;
    }
}
