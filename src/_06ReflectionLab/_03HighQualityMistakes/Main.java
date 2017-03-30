// https://judge.softuni.bg/Contests/Practice/Index/526#2
package _06ReflectionLab._03HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Plamen Markov on 3/30/17.
 */
public class Main {
    public static void main(String[] args) {
        Class aClass = Reflection.class;

        List<String> errors = new ArrayList<>();
        Field[] declaredFields = aClass.getDeclaredFields();
        Arrays.sort(declaredFields, Comparator.comparing(Field::getName));
        for (Field declaredField : declaredFields) {
            if (!Modifier.isPrivate(declaredField.getModifiers())) {
                errors.add(String.format("%s must be private!", declaredField.getName()));
            }
        }

        Method[] declaredMethods = aClass.getDeclaredMethods();
        Arrays.sort(declaredMethods, Comparator.comparing(Method::getName));
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().startsWith("get") && !Modifier.isPublic(declaredMethod.getModifiers())) {
                errors.add(String.format("%s have to be public!", declaredMethod.getName()));
            } else if (declaredMethod.getName().startsWith("set") && !Modifier.isPrivate(declaredMethod.getModifiers())) {
                errors.add(String.format("%s have to be private!", declaredMethod.getName()));
            }
        }

        for (String error : errors) {
            System.out.println(error);
        }
    }
}
