package _04EnumerationsAndAnnotationsLab._01Weekdays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Plamen Markov on 3/25/17.
 */
public class WeeklyCalendar {
    private List<WeeklyEntry> entries;

    public WeeklyCalendar() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes) {
        this.entries.add(new WeeklyEntry(weekday, notes));
    }

    public Iterable<WeeklyEntry> getWeeklySchedule() {
        (this.entries).sort(WeeklyEntry.BY_WEEKDAY);
        return this.entries;
    }
}
