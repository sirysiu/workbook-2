package com.pluralsight.logic;

public class LogicExamples {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        double area = (double) 10 / 3;

        double remainder = 10 % 3;

        System.out.println(area);
        System.out.println(remainder);

        // Arithmetic operators
        // + -  * / %
        // Increment/ Decrement operators
        //++ --

        area = area + 1;
        System.out.println(area);

        area ++;
        System.out.println(area);

        //System.out.println(area++);

        System.out.println(++ area);

        double z = 8.33f;
        System.out.println(z);

        System.out.printf("%.2f\n", z);
        System.out.println(z);

        // Comparison operators
        boolean amIDone = false;
        int counter = 0;

        do {
            System.out.println("talking... words..");

            if (counter++ == 5) amIDone = true;
        } while (! amIDone);

        System.out.println(counter);

        counter =0;
        while( counter != 5) {
            System.out.println("talking... words...");
            counter ++;
        }


        for (int i = 0; i < 5; i++ ) {
            System.out.println("talking..");
        }

        if (counter > 0) {
            System.out.println("we talked about it");
        }
    }
}