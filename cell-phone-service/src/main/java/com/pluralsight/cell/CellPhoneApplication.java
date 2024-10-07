package com.pluralsight.cell;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhoneService cellPhoneService = new CellPhoneService();

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

        System.out.println("\nCell Phone Information:");
        System.out.println("Serial Number: " + cellPhoneService.getSerialNumber());
        System.out.println("Model: " + cellPhoneService.getModel());
        System.out.println("Carrier: " + cellPhoneService.getCarrier());
        System.out.println("Phone Number: " + cellPhoneService.getPhoneNumber());
        System.out.println("Owner: " + cellPhoneService.getOwner());

        scanner.close();
    }
}
