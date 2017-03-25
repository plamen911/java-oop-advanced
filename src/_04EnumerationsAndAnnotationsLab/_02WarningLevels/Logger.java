package _04EnumerationsAndAnnotationsLab._02WarningLevels;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Plamen Markov on 3/25/17.
 */
public class Logger {
    private List<Message> messages;
    private Importance level;

    public Logger(String level) {
        this.level = Enum.valueOf(Importance.class, level);
        this.messages = new ArrayList<>();
    }

    public void receiveMessage(Message message) {
        if (this.level.compareTo(message.getLevel()) < 1) {
            this.messages.add(message);
        }
    }

    public Iterable<Message> getMessages() {
        return this.messages;
    }
}
