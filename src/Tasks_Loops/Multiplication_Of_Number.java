package Tasks_Loops;

import java.util.Scanner;

public class Multiplication_Of_Number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       System.out.println("Enter the number");
       // int num=Integer.parseInt(args[0]);
        int num=scan.nextInt();

        for(int i=0;i<=10;i++)
        {
          //  System.out.println(num*i);
            System.out.println(num+"*"+i+"="+num*i);
           // 10*1=10
        }

    }
}
