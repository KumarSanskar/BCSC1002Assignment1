/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String[] studentFullName;
    private long universityRollNumber;
    private int numberOfIssuedBooks;
    private Book[] booksIssued;

    //constructors:
    public Student(String[] studentFullName, long universityRollNumber, int numberOfIssuedBooks) {
        this.studentFullName = studentFullName.split(" ");
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

    /**
     * This method issues a book to student.
     *
     * @param bookName the name of book to be issued.
     */
    public void issueNewBook(String bookName) {
        System.out.println("Alert!" + bookName + "has been issued to you.");
    }

    /**
     * This method enlists all the books issued till date by the student.
     */
    public void booksIssuedTillNow() {
        for (Book booksIssued : booksIssued) {
            System.out.println(booksIssued);
        }
    }

    /**
     * This method gives the name of book returned to library by student.
     *
     * @param bookName The name of the book returned.
     */
    public void returnTheBook(String bookName) {
        System.out.println("The" + bookName + "has been returned by you successfully");
    }

    //toString method:
    public String toString() {
        return String.format("Student Name: %s, University Roll No. : %d, Numbers of Issued Books: %d, Books Issued %s:",
                Arrays.toString(getStudentFullName()), getUniversityRollNumber(),
                getNumberOfIssuedBooks(), Arrays.toString(getBooksIssued()));
    }

    //equals and hashCode method:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNumber == student.universityRollNumber &&
                numberOfIssuedBooks == student.numberOfIssuedBooks &&
                Arrays.equals(studentFullName, student.studentFullName) &&
                Arrays.equals(booksIssued, student.booksIssued);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(universityRollNumber, numberOfIssuedBooks);
        result = 31 * result + Arrays.hashCode(studentFullName);
        result = 31 * result + Arrays.hashCode(booksIssued);
        return result;
    }
}