package Tasks;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the 1st value");
        int num1=scan.nextInt();
        System.out.println("Enter the 2nd value");
        int num2=scan.nextInt();

        if(num1>num2)
        {
            System.out.println(num1+ " is largest than " +num2);
        }
        else if(num2>num1) {
            System.out.println(num2+ " is largest than " +num1);
        }
        else {
            System.out.println("Both are equal");
        }
        scan.close();
    }
}
