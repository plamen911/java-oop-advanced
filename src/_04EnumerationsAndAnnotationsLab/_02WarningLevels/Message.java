package _04EnumerationsAndAnnotationsLab._02WarningLevels;

/**
 * Created by Plamen Markov on 3/25/17.
 */
public class Message {
    private Importance level;
    private String text;

    public Message(String level, String text) {
        this.level = Enum.valueOf(Importance.class, level);
        this.text = text;
    }

    public Importance getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return this.level + ": " + this.text;
    }
}
