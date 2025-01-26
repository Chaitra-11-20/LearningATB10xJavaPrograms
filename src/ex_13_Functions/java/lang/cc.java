package ex_13_Functions.java.lang;

import java.sql.SQLOutput;
import java.util.Scanner;

public class cc {
    static int add(int a , int b) {
        return a + b;
    }
    static int sub(int a , int b) {
        return a - b;
    }
    static int mul(int a , int b) {
        return a * b;
    }
    static int mod(int a , int b) {
        return a % b;
    }
    static int div(int a , int b) {
        if(b==0)
        {
            System.out.println("Dont divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the num1");
        int a=0;
        if (scan.hasNextInt()){
            a=scan.nextInt();
        }
        else {
            System.out.println("Enter only int");
            System.exit(0);
        }
        System.out.println("Enter the num2");
        int b=0;
        if(scan.hasNextInt())
        {
             b = scan.nextInt();
        }
        else {
            System.out.println("Enter only int");
            System.exit(0);

        }
       int sum_res= add(a, b);
        System.out.println("Sum of 2 numbers is" +sum_res);
       int sub_res= sub(a,b);
        System.out.println(sub_res);
        int mul_res=mul(a,b);
        System.out.println(mul_res);
        int mod_res=mod(a,b);
        System.out.println(mod_res);
        int div_res=div(a,b);
        System.out.println(div_res);

    }


}
