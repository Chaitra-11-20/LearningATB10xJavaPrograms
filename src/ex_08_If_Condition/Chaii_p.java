package ex_08_If_Condition;

import java.util.Scanner;

public class Chaii_p {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1=sc.nextInt();
        System.out.println("enter the 2nd number");
        int num2=sc.nextInt();

        if(num1>num2)
        {
            System.out.println("Num1 is largest");
        }
        else if(num2>num1)
        {
            System.out.println("Num2 is largest");
        }
        else {
            System.out.println("Both are equal");
        }
    }
}
