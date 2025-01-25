package ex_09_Switch;

import java.util.Scanner;

public class chai {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7");
        int day=scan.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
           default:
                System.out.println("Invalid");

        }


    }
}
