package Tasks;

import ex_08_If_Condition.Lab082_if_Else;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Vowel_Or_Consonant {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch=scan.next().charAt(0);

        ch=Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println(ch + " is a vowel.");
        }
        else if(Character.isLetter(ch))
        {
            System.out.println(ch + " is a consonant.");

        }
        else {
            System.out.println(ch + " is not a letter.");
        }
scan.close();
    }
}
