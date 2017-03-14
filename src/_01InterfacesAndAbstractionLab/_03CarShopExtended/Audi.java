package _01InterfacesAndAbstractionLab._03CarShopExtended;

import java.io.Serializable;

/**
 * Created by Plamen Markov on 3/15/17.
 */
public class Audi implements Rentable, Serializable {
    private String countryProduced;
    private String model;
    private String color;
    private Integer horsePower;
    private Integer minRentDays = null;
    private Double pricePerDay = null;

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDays, Double pricePerDay) {
        this.countryProduced = countryProduced;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.minRentDays = minRentDays;
        this.pricePerDay = pricePerDay;
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

    @Override
    public Integer getMinRentDay() {
        return this.minRentDays;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                this.getModel(), this.countryProduced, TIRES);
    }
}
