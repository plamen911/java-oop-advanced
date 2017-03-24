package _03IteratorsAndComparatorsExercises._03StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * Created by Plamen Markov on 3/24/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack();
        String command = "";

        while (!"END".equals(command = reader.readLine())) {
            String[] commandArgs = command.split(", | ");
            String commandType = commandArgs[0];

            try {
                switch (commandType) {
                    case "Push":
                        stack.push(Stream.of(commandArgs).skip(1).map(Integer::parseInt).toArray(Integer[]::new));
                        break;
                    case "Pop":
                        stack.pop();
                        break;
                }
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }

        for (Integer integer : stack) {
            System.out.println(integer);
        }
        for (Integer integer : stack) {
            System.out.println(integer);
        }
    }
}
