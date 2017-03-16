package _01InterfacesAndAbstractionExercises._03Ferrari;

/**
 * Created by Plamen Markov on 3/16/17.
 */
public class Ferrari implements Car {
    private String driver;

    public Ferrari(String driver) {
        this.setDriver(driver);
    }

    public String getDriver() {
        return this.driver;
    }

    @Override
    public void useBrakes() {
        System.out.print("Brakes!");
    }

    @Override
    public void pushGasPedal() {
        System.out.print("Zadu6avam sA!");
    }

    private void setDriver(String driver) {
        this.driver = driver;
    }
}
