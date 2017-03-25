// https://judge.softuni.bg/Contests/Practice/Index/524#1
package _04EnumerationsAndAnnotationsLab._02WarningLevels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Plamen Markov on 3/25/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String level = reader.readLine().trim();
        Logger logger = new Logger(level);
        String line = "";
        while (!"END".equals(line = reader.readLine().trim())) {
            String[] tokens = line.split(":\\s+");
            logger.receiveMessage(new Message(tokens[0], tokens[1]));
        }
        logger.getMessages().forEach(System.out::println);
    }
}
