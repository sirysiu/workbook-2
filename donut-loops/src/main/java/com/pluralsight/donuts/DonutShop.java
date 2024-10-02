package com.pluralsight.donuts;

public class DonutShop {
    public static void main(String[] args) {
        Donut d = new Donut("Boston Creme", 350, 3.50);
        Donut d2 = new Donut("Glazed", 200, 1.99);


        System.out.println(d);
        System.out.println(d2);
        printDonut(d);
        printDonut(d2);
    }

        public static void printDonut (Donut d){
            System.out.println(d.getDescription());
            System.out.printf("$%.2f\n", d.getPrice());
        }

        public static void printDonutAsCVS (Donut d){
            System.out.print(d.getDescription());
            System.out.print(",");
            System.out.print(d.getCalories());
            System.out.print(",");
            System.out.println(d.getPrice());

        }

}