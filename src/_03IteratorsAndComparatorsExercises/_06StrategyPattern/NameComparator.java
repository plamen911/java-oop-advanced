package _03IteratorsAndComparatorsExercises._06StrategyPattern;

import java.util.Comparator;

/**
 * Created by Plamen Markov on 3/24/17.
 */
public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int compareValue = Integer.compare(o1.getName().length(), o2.getName().length());
        if (compareValue == 0) {
            compareValue = Character.compare(o1.getName().toLowerCase().charAt(0), o2.getName().toLowerCase().charAt(0));
        }
        return compareValue;
    }
}
