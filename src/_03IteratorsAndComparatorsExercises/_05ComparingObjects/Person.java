package _03IteratorsAndComparatorsExercises._05ComparingObjects;

/**
 * Created by Plamen Markov on 3/25/17.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getTown() {
        return this.town;
    }

    @Override
    public int compareTo(Person o) {
        int compareByName = this.getName().compareTo(o.getName());
        int compareByAge = Integer.compare(this.getAge(), o.getAge());
        int compareByTown = this.getTown().compareTo(o.getTown());

        if (compareByName == 0) {
            if (compareByAge == 0) {
                return compareByTown;
            }
            return compareByAge;
        }
        return compareByName;
    }
}
