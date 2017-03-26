// https://judge.softuni.bg/Contests/Practice/Index/251#5
package _04EnumerationsAndAnnotationsExercises._06CustomEnumAnnotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String category = reader.readLine().trim();

        Class<?> cl = null;

        switch (category) {
            case "Rank":
                cl = Rank.class;
                break;

            case "Suit":
                cl = Suit.class;
                break;
        }

        assert cl != null;
        for (Annotation annotation : cl.getAnnotations()) {
            System.out.printf("Type = %s, Description = %s",
                    annotation.annotationType().getSimpleName(),
                    ((Enumeration)annotation).description());
        }
    }
}
