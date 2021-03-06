// https://judge.softuni.bg/Contests/Practice/Index/523#2
package _03IteratorsAndComparatorsLab._03ComparableBook;

/**
 * Created by Plamen Markov on 3/23/17.
 */
public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        if (bookOne.compareTo(bookTwo) > 0) {
            System.out.println(String.format("%s is before %s", bookOne, bookTwo));
        } else if (bookOne.compareTo(bookTwo) < 0) {
            System.out.println(String.format("%s is before %s", bookTwo, bookOne));
        } else {
            System.out.println("_03IteratorsAndComparatorsLab._04BookComparator.Book are equal");
        }
    }
}
