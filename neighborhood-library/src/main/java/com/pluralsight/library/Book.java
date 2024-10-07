package com.pluralsight.library;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Book {


    static class BookList {
        private String title;
        private String isbn;
        private int id;
        private boolean isCheckedOut;
        private String checkedOut;

        public BookList(int id, String isbn, String title, boolean isCheckedOut, String checkedOut) {
            this.title = title;
            this.isbn = isbn;
            this.id = id;
            this.isCheckedOut = isCheckedOut;
            this.checkedOut = checkedOut;
        }

        public boolean isCheckedOut() {
            return isCheckedOut;
        }

        public int getId() {
            return id;  // Added method to get ID
        }

        public String getIsbn() {
            return isbn;
        }

        public void checkedIn() {
            isCheckedOut = false;
            checkedOut = null;
        }

        @Override
        public String toString() {
            return String.format("| %-5d | %-13s | %-70s | %-12s | %-20s |",
                    id, isbn, title, isCheckedOut ? "Checked Out" : "Available", checkedOut != null ? checkedOut : "N/A");
        }
    }

    private static BookList[] books = new BookList[20];

    static void initializeBooks() {
        books[0] = new BookList(1, "978-0316015844", "Twilight", true, "Siry Siu");
        books[1] = new BookList(2, "978-0439023528", "The Hunger Games", false, null);
        books[2] = new BookList(3, "978-1503290563", "Pride and Prejudice", true, "Jane Doe");
        books[3] = new BookList(4, "978-0061120084", "To Kill a Mockingbird", false, null);
        books[4] = new BookList(5, "978-0451524935", "1984", true, "John Smith");
        books[5] = new BookList(6, "978-0743273565", "The Great Gatsby", false, null);
        books[6] = new BookList(7, "978-0316769488", "The Catcher in the Rye", true, "Alice Johnson");
        books[7] = new BookList(8, "978-0590353427", "Harry Potter and the Sorcerer's Stone", false, null);
        books[8] = new BookList(9, "978-0142424179", "The Fault in Our Stars", true, "Emily Davis");
        books[9] = new BookList(10, "978-0375842207", "The Book Thief", false, null);
        books[10] = new BookList(11, "978-0062315007", "The Alchemist", true, "Michael Brown");
        books[11] = new BookList(12, "978-0060850524", "Brave New World", false, null);
        books[12] = new BookList(13, "978-0486268795", "The Picture of Dorian Gray", true, "Sarah Lee");
        books[13] = new BookList(14, "978-1451673319", "Fahrenheit 451", false, null);
        books[14] = new BookList(15, "978-0064404990", "The Chronicles of Narnia: The Lion, the Witch and the Wardrobe", true, "David Wilson");
        books[15] = new BookList(16, "978-0307588371", "Gone Girl", false, null);
        books[16] = new BookList(17, "978-0307474278", "The Da Vinci Code", true, "Laura White");
        books[17] = new BookList(18, "978-0735214213", "Little Fires Everywhere", false, null);
        books[18] = new BookList(19, "978-0735219102", "Where the Crawdads Sing", true, "Chris Green");
        books[19] = new BookList(20, "978-0316483697", "Circe", false, null);
    }

    static void viewAvailableBooks() {
        System.out.println();
        System.out.println("\n================================================== Available Books =============================================");
        System.out.println("+-------+----------------+------------------------------------------------------------------------+--------------+----------------------+");
        System.out.println("|  ID   |    ISBN        |                                 Title                                  | Availability | Checked Out To       |");
        System.out.println("+-------+----------------+------------------------------------------------------------------------+--------------+----------------------+");
        for (BookList book : books) {
            if (!book.isCheckedOut()) {
                System.out.println(book);
            }
        }
        System.out.println("================================================================================================================");
        System.out.println();
    }


    public static void viewCheckedOutBooks() {

        System.out.println("\n============================================ Checked Out Books =================================================");
        System.out.println("+-------+----------------+------------------------------------------------------------------------+--------------+----------------------+");
        System.out.println("|  ID   |    ISBN        |                                 Title                                  | Availability | Checked Out To       |");
        System.out.println("+-------+----------------+------------------------------------------------------------------------+--------------+----------------------+");
        for (BookList book : books) {
            if (book.isCheckedOut()) {
                System.out.println(book);
            }
        }
        System.out.println("======================================================================================================================================");
        System.out.println();
    }

    static void checkInBook(Scanner scanner) {
        System.out.println();
        System.out.print("Enter the ID of the book to check in: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;

        for (BookList book : books) {
            if (book.getId() == id && book.isCheckedOut()) {
                book.checkedIn();
                System.out.println("""
                        /)  /)  ~ ┏━━━━━━━━━━━━━━━━━┓
                        ( •-• )  ~ ♡ Book Turned In ♡
                        /づづ ~ ┗━━━━━━━━━━━━━━━━━┛
                        """);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found or not checked out.");
        }


    }
}
