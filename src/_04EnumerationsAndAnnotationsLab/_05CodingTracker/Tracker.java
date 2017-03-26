// // https://judge.softuni.bg/Contests/Practice/Index/524#4
package _04EnumerationsAndAnnotationsLab._05CodingTracker;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Plamen Markov on 3/26/17.
 */
public class Tracker {
    @Author(name = "Pesho")
    public static void printMethodsByAuthor(Class<?> cl) {
        Map<String, List<String>> methodsByAuthor = new HashMap<>();
        for (Method method : cl.getDeclaredMethods()) {
            Author author = method.getAnnotation(Author.class);
            if (author != null) {
                methodsByAuthor.putIfAbsent(author.name(), new ArrayList<>());
                methodsByAuthor.get(author.name()).add(method.getName());
            }
        }
        for (String author : methodsByAuthor.keySet()) {
            System.out.printf("%s: %s%n", author, String.join(", ", methodsByAuthor.get(author)));
        }
    }

    @Author(name = "Gosho")
    public static void main(String[] args) {
        printMethodsByAuthor(Tracker.class);
    }
}
