package com.pluralsight.strings;

public class StringsAndLoops {
    public static void main(String[] args) {
        String[] list = {"Milk", "Eggs", "Bread", "Chips",
        "Salt", "Pepper"};
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        for (String s: list) {
            System.out.println(s);
        }

        String allListItems = "Splenda Tea Coffee Sugar";
        allListItems = allListItems.replace(" ", "\n");
        System.out.println(allListItems); // Separated with lines
        String[] listA = allListItems.split("\n"); // Grabs one var
        System.out.println(listA[2]); // Prints Coffee

        String newList = """ 
                    Splenda 
                        Tea 
                            Coffee 
                                Sugar
                """; // Allows to edit how it looks
        System.out.println(newList);
        String art = """
                ˚∧＿∧  　+        —̳͟͞͞💗
                (  •‿• )つ  —̳͟͞͞ 💗         —̳͟͞͞💗 +
                (つ　 <                —̳͟͞͞💗
                ｜　 _つ      +  —̳͟͞͞💗         —̳͟͞͞💗 ˚
                `し´
                """;
        System.out.println(art);
    }
}
