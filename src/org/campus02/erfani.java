package org.campus02;

public class erfani {

    public static void main(String[] args) {

        String string = "wörter starten mit Großbuchstaben";
        String stringNew = "";

        stringNew += Character.toUpperCase(string.charAt(0));

        for (int i = 1; i < string.length(); i++) {
            if(string.charAt(i)  == ' ') {
                stringNew += " " + Character.toUpperCase(string.charAt(i + 1));
                i++;
            } else {
                stringNew += string.charAt(i);
            }
        }

        string = stringNew;

        System.out.println(string);

    }

}
