package _01InterfacesAndAbstractionExercises._09CollectionHierarchy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public abstract class CustomCollection {

    private List<String> collection;

    protected CustomCollection() {
        this.collection = new ArrayList<>();
    }

    protected List<String> getCollection() {
        return this.collection;
    }
}