package Tasks;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scan.nextInt();
        int original_number=number;
        int  reverse_number =0;

        while(number>0)
        {
            int remainder=number%10;
            reverse_number=reverse_number*10+remainder;
            number=number/10;

        }
        if(original_number==reverse_number)
        {
            System.out.println("Its a palindrome");
        }
        else
        {
            System.out.println("Its not a palindrome");
        }

    }
}
