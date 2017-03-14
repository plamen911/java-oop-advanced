// https://judge.softuni.bg/Contests/Practice/Index/498#1
package _01InterfacesAndAbstractionLab._03CarShopExtended;

/**
 * Created by Plamen Markov on 3/14/17.
 */
public class Main {
    public static void main(String[] args) {
        Sellable seat = new Seat("Leon", "Gray", 110, "Spain", 11111.1);
        Rentable audi = new Audi("Leon", "Gray", 110, "Spain", 3, 99.9);

        printCarInfo(seat);
        printCarInfo(audi);
    }

    private static void printCarInfo(Car car) {
        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                car.getModel(),
                car.getColor(),
                car.getHorsePower()));
        System.out.println(car.toString());
    }
}
