package com.pluralsight.name;
import java.sql.SQLOutput;
import java.util.Scanner;
public class NameMaker {
    public static void main(String[] args) {
        FullNameGenerator fullName = new FullNameGenerator();
        FullNameParser fullParser = new FullNameParser();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type: [1] for Full Name" +"  [2] for Name Parser");
        int command = scanner.nextInt();
        if (command == 1) {
            fullName.fullNameGen();
        } else if (command == 2) {
            fullParser.nameParser();

        }

    }
}
