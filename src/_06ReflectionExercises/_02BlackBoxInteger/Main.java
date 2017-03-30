// https://judge.softuni.bg/Contests/Practice/Index/258#1
package _06ReflectionExercises._02BlackBoxInteger;

import _06ReflectionExercises._02BlackBoxInteger.com.peshoslav.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, NoSuchFieldException {
        Class<?> aClass = BlackBoxInt.class;
        Constructor<?> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt inst = (BlackBoxInt) constructor.newInstance(); // invoke empty constructor

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while (!"END".equals(line = reader.readLine())) {
            String[] tokens = line.split("_");
            String methodName = tokens[0];
            int methodParam = Integer.parseInt(tokens[1]);

            Method method = aClass.getDeclaredMethod (methodName, int.class);
            method.setAccessible(true);
            method.invoke(inst, methodParam);// pass arg

            Field innerValue = aClass.getDeclaredField("innerValue");
            innerValue.setAccessible(true);
            System.out.println(innerValue.get(inst));
        }
    }
}
