package Tasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //	•	If the year is divisible by 4 and not divisible by 100, or if it is divisible by 400, then it’s a leap year.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year= scanner.nextInt();
        if((year%4==0 && year%100!=0) ||  (year%400==0))
        {
            System.out.println("Its a leap year");
        }
        else {
            System.out.println("Its not a leap year");
        }

    }
}
