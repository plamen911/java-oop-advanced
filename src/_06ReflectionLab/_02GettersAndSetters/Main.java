// https://judge.softuni.bg/Contests/Practice/Index/526#1
package _06ReflectionLab._02GettersAndSetters;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Plamen Markov on 3/30/17.
 */
public class Main {
    public static void main(String[] args) {
        Class aClass = Reflection.class;
        Method[] declaredMethods = aClass.getDeclaredMethods();
        List<Method> getterMethods = new ArrayList<>();
        List<Method> setterMethods = new ArrayList<>();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().startsWith("get")) {
                getterMethods.add(declaredMethod);
            } else if (declaredMethod.getName().startsWith("set")) {
                setterMethods.add(declaredMethod);
            }
        }
        getterMethods.sort(Comparator.comparing(Method::getName));
        setterMethods.sort(Comparator.comparing(Method::getName));

        for (Method getterMethod : getterMethods) {
            System.out.printf("%s will return %s%n", getterMethod.getName(), getterMethod.getReturnType());
        }

        for (Method setterMethod : setterMethods) {
            System.out.printf("%s and will set field of ", setterMethod.getName());
            Class<?>[] parameterTypes = setterMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.printf("%s", parameterType);
            }
            System.out.println();
        }

    }
}
