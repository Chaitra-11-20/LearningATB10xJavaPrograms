package ex_13_Functions.java.lang;

import java.util.Scanner;

public class Lab130 {

    static int  sum(int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
     int SUM=   sum(5,6);
        System.out.println(SUM);
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=0;
        if(scan.hasNextInt())
        {
            a=scan.nextInt();
        }
        else {
            System.out.println("Enter in int");
            System.exit(0);
        }

        System.out.println("Enter the value of b");

        int b=0;
        if(scan.hasNextInt())
        {
            b=scan.nextInt();
        }
        else {
            System.out.println("Enter in int");
            System.exit(0);
        }

       int res= sum(a,b);
        System.out.println(res);
    }
}
