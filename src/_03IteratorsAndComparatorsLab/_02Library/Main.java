// https://judge.softuni.bg/Contests/Practice/Index/523#1
package _03IteratorsAndComparatorsLab._02Library;

/**
 * Created by Plamen Markov on 3/22/17.
 */
public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        Library<Book> library = new Library<>(bookOne, bookTwo, bookThree);

        for (Book book : library) {
            System.out.println(book.getTitle());
        }
    }
}
