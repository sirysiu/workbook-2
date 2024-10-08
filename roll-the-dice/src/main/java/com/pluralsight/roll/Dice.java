package com.pluralsight.roll;

public class Dice {

    public int roll() {
        int randomNumber = (int)(Math.random() * 6) + 1;

        return randomNumber;
    }


}
