package ex_13_Functions.java.lang;

public class ch {
    public static void main(String[] args) {
        String name = "Chaitra Chidananda";
        int vowels = 0;
        int consonents = 0;

        name = name.toLowerCase();

        for (int i = 1; i < name.length(); i++) {
            char c = name.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else {
                consonents++;
            }
            System.out.println("Vowels " + vowels);
            System.out.println("Con " + consonents);
        }
    }
}
