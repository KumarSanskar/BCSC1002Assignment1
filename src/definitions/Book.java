/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private String isbnNumber;

    //constructors:
    public Book(String bookName, String authorName, String isbnNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbnNumber = isbnNumber;
    }

    //getters and setters:
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    //toString method:
    public String toString() {
        return String.format("Book Name: %s, Author's Name: %s, ISBN Number: %s", getBookName(), getAuthorName(), getIsbnNumber());
    }

}
