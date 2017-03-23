// https://judge.softuni.bg/Contests/Practice/Index/254#0
package _03IteratorsAndComparatorsExercises._01ListyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Plamen Markov on 3/23/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        ListyIterator<String> listyIterator = null;

        while (!"END".equals(line = reader.readLine())) {
            String[] commands = line.split("\\s+");
            switch (commands[0]) {
                case "Create":
                    String[] elements = Arrays.stream(commands).skip(1L).toArray(String[]::new);
                    listyIterator = new ListyIteratorImpl<>(elements);
                    break;

                case "Move":
                    assert listyIterator != null;
                    System.out.println(listyIterator.move());
                    break;

                case "HasNext":
                    assert listyIterator != null;
                    System.out.println(listyIterator.hasNext());
                    break;

                case "Print":
                    try {
                        assert listyIterator != null;
                        listyIterator.print();
                    } catch (UnsupportedOperationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
    }
}
