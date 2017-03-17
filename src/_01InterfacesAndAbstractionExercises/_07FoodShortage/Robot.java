package _01InterfacesAndAbstractionExercises._07FoodShortage;

/**
 * Created by Plamen Markov on 3/17/17.
 */
public class Robot implements Visitor {
    private String id;
    private String model;

    public Robot(String id, String model) {
        this.setId(id);
        this.setModel(model);
    }

    @Override
    public String getId() {
        return this.id;
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setModel(String model) {
        this.model = model;
    }
}
