/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

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

}
