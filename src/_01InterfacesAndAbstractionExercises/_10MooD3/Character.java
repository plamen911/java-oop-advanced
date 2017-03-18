package _01InterfacesAndAbstractionExercises._10MooD3;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public abstract class Character<E, P extends Number> implements GameObject<E, P> {

    private String username;
    private E hashedPassword;
    private int level;
    protected P specialPoints;

    protected Character(String username, int level, P specialPoints) {
        this.username = username;
        this.level = level;
        this.specialPoints = specialPoints;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s%n", this.getUsername(), this.getHashedPassword(),
                this.getClass().getSimpleName());
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public E getHashedPassword() {
        return this.hashedPassword;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public P getSpecialPoints() {
        return this.specialPoints;
    }

    @Override
    public void setHashedPassword(E hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
}