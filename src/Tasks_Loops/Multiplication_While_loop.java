package Tasks_Loops;

import java.util.Scanner;

public class Multiplication_While_loop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number");
        int num=scan.nextInt();
        int i=1;

        while(i<=10)
        {

            System.out.println(num*i);
            i++;

        }
    }
}
