// https://judge.softuni.bg/Contests/Practice/Index/523#3
package _03IteratorsAndComparatorsLab._04BookComparator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Plamen Markov on 3/23/17.
 */
public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        books.sort(new BookComparator());

        for (Book book : books) {
            System.out.println(book.getTitle() + book.getYear());
        }
    }
}
