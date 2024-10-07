package com.pluralsight.cell;

import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhoneService cellPhoneService = new CellPhoneService();
        input(cellPhoneService, scanner);

        CellPhoneService cellPhoneService1 = new CellPhoneService();
        input(cellPhoneService1, scanner);

        display(cellPhoneService);
        display(cellPhoneService1);

        cellPhoneService.dial(cellPhoneService.getPhoneNumber());
        cellPhoneService1.dial(cellPhoneService1.getPhoneNumber());

        scanner.close();
    }

    public static void input(CellPhoneService cellPhoneService, Scanner scanner) {

        System.out.println("What is the serial number? ");
        cellPhoneService.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.println("What model is the phone? ");
        cellPhoneService.setModel(scanner.nextLine());

        System.out.println("Who is the carrier? ");
        cellPhoneService.setCarrier(scanner.nextLine());

        System.out.println("What is the Phone number? ");
        cellPhoneService.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the owner of the phone? ");
        cellPhoneService.setOwner(scanner.nextLine());
    }

    public static void display(CellPhoneService cellPhoneService) {
        System.out.println("\nCell Phone Information:");
        System.out.println("Serial Number: " + cellPhoneService.getSerialNumber());
        System.out.println("Model: " + cellPhoneService.getModel());
        System.out.println("Carrier: " + cellPhoneService.getCarrier());
        System.out.println("Phone Number: " + cellPhoneService.getPhoneNumber());
        System.out.println("Owner: " + cellPhoneService.getOwner());


    }
}