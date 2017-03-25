package _04EnumerationsAndAnnotationsLab._01Weekdays;

/**
 * Created by Plamen Markov on 3/25/17.
 */
public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public String toString() {
        return super.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
}
