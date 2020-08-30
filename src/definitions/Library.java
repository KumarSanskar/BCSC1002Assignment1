/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] booksAvailable;

    //constructor:
    public Library() {
        this.booksAvailable = new Book[20000];
    }

    //getters and setters:
    public Book[] getBooksAvailable() {
        return booksAvailable;
    }

    public void setBooksAvailable(Book[] booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    //toString method:
    public String toString() {
        return String.format("Books Available: %s", getBooksAvailable());
    }

    //equals and hashcode method:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(booksAvailable, library.booksAvailable);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(booksAvailable);
    }
}
