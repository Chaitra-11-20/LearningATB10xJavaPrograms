package Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Largest_Of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1=scan.nextInt();
        System.out.println("Enter the num2");
        int num2=scan.nextInt();
        System.out.println("Enter the num3");
        int num3=scan.nextInt();


       String Largest= (num1>num2)?((num1>num3)?"num1":"num3"):((num2>num3)?"num2":"num3");
        System.out.println("Largest number is " + Largest);
    }
}
