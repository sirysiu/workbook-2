package com.pluralsight.theater;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your name: ");
        String name = scanner.nextLine();


        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String date = scanner.nextLine();

        System.out.println("How many ticket would you like? ");
        int tickets = scanner.nextInt();

        String[] nameParts = name.split(" ", 2);
        String fName = nameParts[0];
        String lName = nameParts[1];
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate reservations = LocalDate.parse(date, format);
        System.out.println(tickets + " tickets reserved for " + reservations + " under " + lName + ", " + fName);
    }
}
