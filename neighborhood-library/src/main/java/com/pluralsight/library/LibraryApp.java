package com.pluralsight.library;

import java.util.Scanner;

import static com.pluralsight.library.Book.checkInBook;

public class LibraryApp {

    public static void main(String[] args) {
        Book b = new Book();
        Book.initializeBooks();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("============= Home Screen ==================");
            System.out.println("=      1. View Available Books             =");
            System.out.println("=      2. View Checked Out Book            =");
            System.out.println("=      3. Check In a Book                  =");
            System.out.println("=============================================");
            System.out.println("               x. Exit");
            System.out.print("=> Please select an option: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Book.viewAvailableBooks();
                    break;
                case "2":
                    Book.viewCheckedOutBooks();
                    break;
                case "3":
                    checkInBook(scanner);
                    break;
                case "x":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (!choice.equals("x"));

        scanner.close();
    }


}

