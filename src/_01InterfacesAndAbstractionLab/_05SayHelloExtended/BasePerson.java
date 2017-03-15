package _01InterfacesAndAbstractionLab._05SayHelloExtended;

/**
 * Created by Plamen Markov on 3/15/17.
 */
public abstract class BasePerson implements Person {
    private String name;

    protected BasePerson(String name) {
        this.setName(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
