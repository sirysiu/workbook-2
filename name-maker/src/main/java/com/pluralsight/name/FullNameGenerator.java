package com.pluralsight.name;


import java.util.Scanner;

public class FullNameGenerator {
    static Scanner s;

    public void fullNameGen() {

        s = new Scanner(System.in);


        String firstName = getUserInputWithPrompt("Enter your first name: ");
        String middleName = getUserInputWithPrompt("Enter your middle name: ");
        String lastName = getUserInputWithPrompt("Enter your last name: ");
        String suffix = getUserInputWithPrompt("Enter your suffix name? ");
        if (middleName.isBlank()) {
            System.out.println();
        }

        String fullName = firstName + " " + middleName+ " " + lastName  + " " + suffix;

        String trimmedName = fullName.trim();
        String extraSpacesName = trimmedName.replaceAll("\\s+", " ");
        System.out.println("Thank you, " + extraSpacesName);

    }

    public static String getUserInputWithPrompt(String prompt){
        System.out.print(prompt);
        return s.nextLine();
    }


}

