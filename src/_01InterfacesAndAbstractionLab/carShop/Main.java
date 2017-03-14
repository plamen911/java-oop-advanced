// https://judge.softuni.bg/Contests/Practice/Index/498#0
package _01InterfacesAndAbstractionLab.carShop;

/**
 * Created by Plamen Markov on 3/14/17.
 */
public class Main {
    public static void main(String[] args) {
        Car seat = new Seat("Leon", "gray", 110, "Spain");

        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                seat.getModel(),
                seat.getColor(),
                seat.getHorsePower()));
        System.out.println(seat.toString());
    }
}
