package _01InterfacesAndAbstractionExercises._03Ferrari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;

/**
 * Created by Plamen Markov on 3/16/17.
 */
public class Main {
    public static void main(String[] args) throws IllegalClassFormatException, IOException {
        String ferrariName = Ferrari.class.getSimpleName();
        String carInterface = Car.class.getSimpleName();
        boolean isCreated = Car.class.isInterface();
        if (!isCreated) {
            throw new IllegalClassFormatException("No interface created!");
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String driver = reader.readLine().trim();
        Car car = new Ferrari(driver);
        System.out.printf("%s/", Car.model);
        car.useBrakes();
        System.out.print("/");
        car.pushGasPedal();
        System.out.print("/");
        System.out.println(((Ferrari)car).getDriver());
    }
}
