package Tasks;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Year");
        int year= scan.nextInt();

        if(((year%4==0) && (year%100!=0)) ||(year%400==0))
        {
            System.out.println("Its a leap year");
        }
        else {
            System.out.println("Its not a leap year");
        }


    }
}
