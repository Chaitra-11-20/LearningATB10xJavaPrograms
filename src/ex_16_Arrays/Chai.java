package ex_16_Arrays;

import java.util.Scanner;

public class Chai {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the value");
        int value=scan.nextInt();

        for(int i = value; i>=0; i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
