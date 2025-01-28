package ex_13_Functions.java.lang;

public class h {

    public static void main(String[] args) {
        String str = "pramod"; // Example string
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase to handle both uppercase and lowercase letters
        str = str.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // Get each character

            // Check if the character is a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
            // Check if the character is a consonant (must be a letter)
            else if (Character.isLetter(c)) {
                consonantCount++;
            }
        }

        // Print the results
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}