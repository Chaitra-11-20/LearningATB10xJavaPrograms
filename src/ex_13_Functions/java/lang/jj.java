package ex_13_Functions.java.lang;

public class jj {

        public static void main(String[] args) {
            String S = "Bhagyashri Ahirrao";
            int V = 0;
            int C = 0;

            for (char c : S.toCharArray()) {
                c = Character.toLowerCase(c);

                if (Character.isLetter(c)) {

                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        V++;
                    } else {

                        C++;
                    }
                }
            }
            System.out.println("Vowels: " + V);
            System.out.println("Consonants: " + C);
        }
    }


