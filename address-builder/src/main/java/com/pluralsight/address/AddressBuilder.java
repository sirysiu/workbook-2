package com.pluralsight.address;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder address = new StringBuilder();
        System.out.println("Please Provide the following information:" );


        System.out.println("Full name: ");
        String name = scanner.nextLine();
        System.out.println("Billing Street: ");
        String street = scanner.nextLine();
        System.out.println("Billing City: ");
        String city = scanner.nextLine();
        System.out.println("Billing State: ");
        String state = scanner.nextLine();
        System.out.println("Billing Zip Code: ");
        int zipCode = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Shipping Street: ");
        String shipStreet = scanner.nextLine();
        System.out.println("Shipping City: ");
        String shipCity = scanner.nextLine();
        System.out.println("Shipping State: ");
        String shipState = scanner.nextLine();
        System.out.println("Shipping Zip Code: ");
        int shipZipCode = scanner.nextInt();
        System.out.println();

address.append(name)
        .append("\n \n")
        .append("Billing Address: \n")
        .append(street)
        .append("\n")
        .append(city)
        .append(", ")
        .append(state)
        .append(" ")
        .append(zipCode)
        .append("\n \n")
        .append("Shipping Address: \n")
        .append(shipStreet)
        .append(" \n")
        .append(shipCity)
        .append(", ")
        .append(shipState)
        .append(" ")
        .append(shipZipCode);
    String allAddresses = address.toString();
        System.out.println(allAddresses);

    }
}

