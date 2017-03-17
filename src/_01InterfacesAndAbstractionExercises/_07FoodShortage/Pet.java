package _01InterfacesAndAbstractionExercises._07FoodShortage;

/**
 * Created by Plamen Markov on 3/17/17.
 */
public class Pet implements Birthable {
    private String id;
    String name;
    String birthday;

    public Pet( String name, String birthday) {
        this.setName(name);
        this.setBirthday(birthday);
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
