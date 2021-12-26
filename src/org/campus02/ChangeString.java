package org.campus02;

import java.util.Arrays;

public class ChangeString {

    public static void main(String[] args) {

        String string = "wörter starten mit Großbuchstaben";
        String stringNew = "";
        CSVParser str1 = new CSVParser("spalte1,spalte2,spalte3");
        stringNew += Character.toUpperCase(string.charAt(0));

        for (int i = 1; i < string.length(); i++) {
            if(string.charAt(i)  == ' ') {
                stringNew += " " + Character.toUpperCase(string.charAt(i + 1));
                i++;
            } else {
                stringNew += string.charAt(i);
            }
        }
        System.out.println(stringNew);

        // CSVParser DemoApp
        System.out.println("Comma's: " + str1.countComma());

        System.out.println(Arrays.toString(str1.parse()));
    }

}
