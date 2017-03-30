// https://judge.softuni.bg/Contests/Practice/Index/258#0
package _06ReflectionExercises._01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws IOException {
        Class<?> aClass = RichSoilLand.class;
        Field[] declaredFields = aClass.getDeclaredFields();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command;
        while (!"HARVEST".equals(command = reader.readLine())) {
            for (Field declaredField : declaredFields) {
                if (command.equals(Modifier.toString(declaredField.getModifiers())) || command.equals("all")) {
                    System.out.println(String.format("%s %s %s",
                            Modifier.toString(declaredField.getModifiers()),
                            declaredField.getType().getSimpleName(),
                            declaredField.getName()
                    ));
                }
            }
        }
    }
}
