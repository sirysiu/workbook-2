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
        System.out.println("Shipping Zip Code: \n ");
        int shipZipCode = scanner.nextInt();

address.append(name + "\n \n").append("Billing Address: \n").append(street + "\n").append(city).append(", ").append(state + " ").append(zipCode + "\n \n").
        append("Shipping Address: \n").append(shipStreet + " \n").append(shipCity + ", ").append(shipState + " ").append(shipZipCode);
    String allAddresses = address.toString();
        System.out.println(allAddresses);

    }
}

