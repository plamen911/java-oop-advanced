package _03IteratorsAndComparatorsLab._04BookComparator;

import java.util.Comparator;

/**
 * Created by Plamen Markov on 3/23/17.
 */
public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getTitle().compareTo(o2.getTitle()) == 0) {
            return Integer.compare(o1.getYear(), o2.getYear());
        }
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
