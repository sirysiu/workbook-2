package com.pluralsight.name;

import java.net.StandardSocketOptions;
import java.util.Arrays;
import java.util.Scanner;

public class FullNameParser {
    static Scanner s;

    public void nameParser() {
        s = new Scanner(System.in);
        System.out.println("Hello User");

        String userFullName = getUserInputPrompt("Enter your Full Name");

        String[] userInput = userFullName.split(" ");


        String firstName = userInput[0];
        String lastName = userInput[userInput.length - 1];
        String middleName = "none";

        if (userInput.length > 2) {
            middleName = String.join(" ", Arrays.copyOfRange(userInput, 1, userInput.length - 1));
        }
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
    }


    public static String getUserInputPrompt(String prompt) {
        System.out.print(prompt);
        return s.nextLine();
    }
}
