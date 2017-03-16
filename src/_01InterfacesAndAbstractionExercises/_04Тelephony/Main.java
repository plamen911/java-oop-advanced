// https://judge.softuni.bg/Contests/Practice/Index/246#3
package _01InterfacesAndAbstractionExercises._04Тelephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Plamen Markov on 3/16/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] phones = reader.readLine().split("\\s+");
        String[] urls = reader.readLine().split("\\s+");

        for (String phoneNumber : phones) {
            Callable phone = new Smartphone();
            phone.call(phoneNumber);
            System.out.println();
        }

        for (String siteUrl : urls) {
            Browseable phone = new Smartphone();
            phone.browse(siteUrl);
            System.out.println();
        }
    }
}
