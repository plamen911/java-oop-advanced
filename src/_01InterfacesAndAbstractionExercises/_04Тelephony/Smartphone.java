package _01InterfacesAndAbstractionExercises._04Тelephony;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Plamen Markov on 3/16/17.
 */
public class Smartphone implements Callable, Browseable {
    @Override
    public void call(String phoneNumber) {
        final Pattern pattern = Pattern.compile(phoneRegex);
        final Matcher matcher = pattern.matcher(phoneNumber);

        if (!matcher.find()) {
            System.out.printf("Calling... %s", phoneNumber);
        } else {
            System.out.print("Invalid number!");
        }
    }

    @Override
    public void browse(String siteUrl) {
        final Pattern pattern = Pattern.compile(urlRegex);
        final Matcher matcher = pattern.matcher(siteUrl);

        if (!matcher.find()) {
            System.out.printf("Browsing: %s!", siteUrl);
        } else {
            System.out.print("Invalid URL!");
        }
    }
}
