package Tasks;

import java.util.Scanner;

public class Positive_Or_Negative {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value");
        int num=scan.nextInt();

        if(num>=0)
        {
            System.out.println(num+ " is a positive number");
        }
        else{
            System.out.println(num+ " is a Negative number");
        }
        scan.close();
    }
}
