package _01InterfacesAndAbstractionLab.carShop;

/**
 * Created by Plamen Markov on 3/14/17.
 */
public interface Car {
    Integer TIRES = 4;

    String getModel();

    String getColor();

    Integer getHorsePower();
}
