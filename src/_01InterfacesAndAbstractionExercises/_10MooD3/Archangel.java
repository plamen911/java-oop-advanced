package _01InterfacesAndAbstractionExercises._10MooD3;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public class Archangel extends Character<String, Integer> {

    public Archangel(String username, int level, Integer specialPoints) {
        super(username, level, specialPoints);
        this.hashPassword();
    }

    @Override
    public Integer getSpecialResult() {
        return super.getSpecialPoints() * super.getLevel();
    }

    @Override
    public void hashPassword() {
        StringBuilder username = new StringBuilder(super.getUsername());
        super.setHashedPassword(username.reverse().toString() + super.getUsername().length() * 21);
    }

    @Override
    public String toString() {
        return super.toString() + this.getSpecialResult();
    }
}