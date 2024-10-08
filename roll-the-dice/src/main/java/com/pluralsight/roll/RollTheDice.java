package com.pluralsight.roll;

public class RollTheDice {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int roll1, roll2;
        int twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;

        for (int i = 0; i < 20; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;
            System.out.printf("Roll %d: %d - %d Sum: %d%n", i + 1, roll1, roll2, sum);
            if (sum == 2) twoCounter++;
            if (sum == 4) fourCounter++;
            if (sum == 6) sixCounter++;
            if (sum == 7) sevenCounter++;

        }
        System.out.printf("Number of times 2 was rolled: %d%n", twoCounter);
        System.out.printf("Number of times 4 was rolled: %d%n", fourCounter);
        System.out.printf("Number of times 6 was rolled: %d%n", sixCounter);
        System.out.printf("Number of times 7 was rolled: %d%n", sevenCounter);

    }
}
