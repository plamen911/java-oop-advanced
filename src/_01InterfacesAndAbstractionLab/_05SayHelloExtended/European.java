package _01InterfacesAndAbstractionLab._05SayHelloExtended;

/**
 * Created by Plamen Markov on 3/15/17.
 */
public class European extends BasePerson implements Person {
    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
