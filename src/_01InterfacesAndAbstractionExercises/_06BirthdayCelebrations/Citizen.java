package _01InterfacesAndAbstractionExercises._06BirthdayCelebrations;

/**
 * Created by Plamen Markov on 3/17/17.
 */
public class Citizen implements Visitor, Birthday {
    private String id;
    private String name;
    private int age;
    String birthday;

    public Citizen(String id, String name, int age, String birthday) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.setBirthday(birthday);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
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

    private void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
