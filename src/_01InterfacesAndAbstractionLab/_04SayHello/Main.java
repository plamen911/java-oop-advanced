// https://judge.softuni.bg/Contests/Practice/Index/498#2
package _01InterfacesAndAbstractionLab._04SayHello;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Plamen Markov on 3/15/17.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Bulgarian("Pesho"));
        persons.add(new European("Pesho"));
        persons.add(new Chinese("Pesho"));

        for (Person person : persons) {
            print(person);
        }
    }

    private static void print(Person person) {
        System.out.println(person.sayHello());
    }
}
