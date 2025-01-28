package ex_13_Functions.java.lang;

import java.util.Locale;

public class Task {
    public static void main(String[] args) {

        String name = "Chaitra Chidananda";
        int vowels = 0;
        int consonents = 0;

        name = name.toLowerCase();

        for (int i = 1; i < name.length(); i++) {
            char c = name.charAt(i);
            {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else if (Character.isLetter(c)) {
                    consonents++;
                }
            }
        }
        System.out.println("VOWELS " + vowels);
        System.out.println("Consonents " + consonents);
    }
}
