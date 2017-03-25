package _04EnumerationsAndAnnotationsLab._01Weekdays;

import java.util.Comparator;

/**
 * Created by Plamen Markov on 3/25/17.
 */
public class WeeklyEntry {
    public static Comparator<WeeklyEntry> BY_WEEKDAY = getComparatorByWeekday();

    private Weekday weekday;
    private String notes;

    public WeeklyEntry(String weekday, String notes) {
        this.weekday = Enum.valueOf(Weekday.class, weekday.toUpperCase());
        this.notes = notes;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.weekday, this.notes);
    }

    private static Comparator<WeeklyEntry> getComparatorByWeekday() {
        return Comparator.comparingInt(e -> e.weekday.ordinal());
    }
}
