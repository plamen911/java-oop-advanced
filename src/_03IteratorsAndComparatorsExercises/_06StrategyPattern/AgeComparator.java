package _03IteratorsAndComparatorsExercises._06StrategyPattern;

import java.util.Comparator;

/**
 * Created by Plamen Markov on 3/24/17.
 */
public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        // return Integer.compare(o1.getAge(), o2.getAge());
        return o1.getAge() - o2.getAge();
    }
}
