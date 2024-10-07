package com.pluralsight.highscore;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Put input here for Example: home|visitor|1|1  ");
        String input = scanner.nextLine();

        String[] tokens = input.split(Pattern.quote("|"));
        if (tokens.length != 4) {
            System.out.println("Invalid input format. Please provide input in the format: home|visitor|homeScore|visitorScore");
            return;
        }
        String home = tokens[0];
        String visitor = tokens[1];
        int homeScore = Integer.parseInt(tokens[2]);
        int visitorScore = Integer.parseInt(tokens[3]);



        if (homeScore > visitorScore) {
            System.out.println("Winner: " + home);
        } else {
            System.out.println("Winner: " + visitor);
        }



    }
}
