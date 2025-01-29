package ex_13_Functions.java.lang;

import java.util.Scanner;

public class VowelsOrConsonents {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the char");
       char c=scan.next().charAt(0);

       c=Character.toLowerCase(c);

       if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
       {
           System.out.println("Vowels");
       }
       else if(Character.isLetter(c))
       {
           System.out.println("Cons");

       }
       else {
           System.out.println("Its not a letter");
       }
    }
}
