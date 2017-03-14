package _01InterfacesAndAbstractionLab._03CarShopExtended;

import java.io.Serializable;

/**
 * Created by Plamen Markov on 3/14/17.
 */
public class Seat implements Car, Sellable, Serializable {
    private String countryProduced;
    private String model;
    private String color;
    private Integer horsePower;
    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        this.countryProduced = countryProduced;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.price = price;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    public String getCountryProduced() {
        return this.countryProduced;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                        this.getModel(), this.getCountryProduced(), TIRES);
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
