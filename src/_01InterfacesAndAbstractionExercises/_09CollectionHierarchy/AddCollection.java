package _01InterfacesAndAbstractionExercises._09CollectionHierarchy;

/**
 * Created by Plamen Markov on 3/18/17.
 */
public class AddCollection extends CustomCollection implements Addable {

    @Override
    public int add(String element) {
        super.getCollection().add(element);
        return super.getCollection().size() - 1;
    }
}