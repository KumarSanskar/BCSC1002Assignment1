/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int ADD_NEWBOOK = 1;
    public static final int RETURN_BOOK = 2;
    public static final int MY_ALL_BOOKS = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        Student student = new Student("Lalit Kumar Saini ", 191500181, 6);
        do {
            System.out.print("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n" +
                    "How may I help you today?\n" +
                    "1. Issue a new book for me.\n" +
                    "2. Return a previously issues book for me.\n" +
                    "3. Show me all my issues books.\n" +
                    "4. Exit.\n");
            System.out.println("Enter your choice(1...4): ");
            userInput = scanner.nextInt();
            switch (userInput) {
                case ADD_NEWBOOK:
                    System.out.println("Enter the name of the book you want to read: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    student.issueNewBook(bookName);
                    break;
                case RETURN_BOOK:
                    System.out.println("Enter the name of book you wnat to return: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    student.returnTheBook(bookName);
                    break;
                case MY_ALL_BOOKS:
                    student.booksIssuedTillNow();
                    break;

                default:
                    System.out.println("Invalid Choice, Please enter valid choice!");
            }
        } while (userInput != EXIT);
        scanner.close();
    }
}
