// https://judge.softuni.bg/Contests/Practice/Index/246#9
package _01InterfacesAndAbstractionExercises._10MooD3;

import java.awt.image.ImagingOpException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public class Main {
    public static void main(String[] args) throws ImagingOpException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] charArgs = reader.readLine().split(" \\| ");
        String characterType = charArgs[1];
        GameObject gameObject = null;

        switch (characterType) {
            case "Demon":
                gameObject = new Demon(charArgs[0], Integer.parseInt(charArgs[3]), Double.parseDouble(charArgs[2]));
                break;
            case "Archangel":
                gameObject = new Archangel(charArgs[0], Integer.parseInt(charArgs[3]), Integer.parseInt(charArgs[2]));
                break;
        }
        System.out.println(gameObject);
    }
}
