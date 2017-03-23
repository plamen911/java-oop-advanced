package _03IteratorsAndComparatorsLab._04BookComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Plamen Markov on 3/22/17.
 */
public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setAuthors(String... authors) {
        if (authors.length == 0) {
            this.authors = new ArrayList<>();
        } else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    @Override
    public String toString() {
        return this.getTitle();
    }

    @Override
    public int compareTo(Book o) {
        if (this.getTitle().compareTo(o.getTitle()) == 0) {
            return Integer.compare(this.getYear(), o.getYear());
        }
        return this.getTitle().compareTo(o.getTitle());
    }
}
