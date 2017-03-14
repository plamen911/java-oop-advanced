package _01InterfacesAndAbstractionLab._03CarShopExtended;

/**
 * Created by Plamen Markov on 3/14/17.
 */
public interface Rentable extends Car {
    Integer getMinRentDay();
    Double getPricePerDay();
}
