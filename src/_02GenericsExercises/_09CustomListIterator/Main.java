// https://judge.softuni.bg/Contests/Practice/Index/247#8
package _02GenericsExercises._09CustomListIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Plamen Markov on 3/22/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CommandInterpreter commandInterpreter = new CommandInterpreter();
        CustomList<String> list = new CustomList<>();
        String command;
        while (!"END".equals(command = reader.readLine())) {
            String[] commandArgs = command.split(" ");
            commandInterpreter.readCommand(commandArgs, list);
        }
    }
}
