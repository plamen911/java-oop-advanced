// https://judge.softuni.bg/Contests/Practice/Index/524#0
package _04EnumerationsAndAnnotationsLab._01Weekdays;

/**
 * Created by Plamen Markov on 3/25/17.
 */
public class Main {
    public static void main(String[] args) {
        WeeklyCalendar wc = new WeeklyCalendar();
        wc.addEntry("Friday", "sleep");
        wc.addEntry("Monday", "sport");
        Iterable<WeeklyEntry> schedule = wc.getWeeklySchedule();
        for (WeeklyEntry weeklyEntry : schedule) {
            System.out.println(weeklyEntry);
        }
    }
}
