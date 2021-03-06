// https://judge.softuni.bg/Contests/Practice/Index/526#0
package _06ReflectionLab._01Reflection;

/**
 * Created by Plamen Markov on 3/30/17.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class aClass = Reflection.class;
        System.out.println(aClass);
        System.out.println(aClass.getSuperclass());
        Class[] interfaces = aClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
        Reflection ref = (Reflection) aClass.newInstance();
        System.out.println(ref);
    }
}
