package ex_13_Functions.java.lang;

public class Assignment {
    public static void main(String[] args) {
        String name = "Gautam Guruswamy";
        int vow = 0;
        int cons = 0;

        name = name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vow++;
            } else if (Character.isLetter(c)) {
                cons++;
            }

        }
        System.out.println(" vowels" + vow);
        System.out.println(" Cons" + cons);
    }
}
