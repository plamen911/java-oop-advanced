// https://judge.softuni.bg/Contests/Practice/Index/251#8
package _04EnumerationsAndAnnotationsExercises._09TrafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Plamen Markov on 3/29/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] signals = reader.readLine().split("\\s+");
        List<TrafficLight> lights = new ArrayList<>();

        for (String signal : signals) {
            TrafficLight trafficLight = new TrafficLight(Signal.valueOf(signal));
            lights.add(trafficLight);
        }

        int lightUpdates = Integer.parseInt(reader.readLine());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lightUpdates; i++) {
            for (TrafficLight light : lights) {
                result.append(light.update()).append(" ");
            }
            result.append(System.lineSeparator());
        }

        System.out.println(result.toString().trim());
    }
}
