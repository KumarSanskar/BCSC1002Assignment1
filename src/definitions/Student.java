/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String[] studentFullName;
    private long universityRollNumber;
    private int numberOfIssuedBooks;
    private Book[] booksIssued;

    //constructors:
    public Student(String[] studentFullName, long universityRollNumber, int numberOfIssuedBooks) {
        this.studentFullName = studentFullName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfIssuedBooks = numberOfIssuedBooks;
        this.booksIssued = new Book[numberOfIssuedBooks];
    }

    //getters and setters:
    public String[] getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String[] studentFullName) {
        this.studentFullName = studentFullName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfIssuedBooks() {
        return numberOfIssuedBooks;
    }

    public void setNumberOfIssuedBooks(int numberOfIssuedBooks) {
        this.numberOfIssuedBooks = numberOfIssuedBooks;
    }

    public Book[] getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(Book[] booksIssued) {
        this.booksIssued = booksIssued;
    }

}
