package Tasks;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the age value");
        int age=scan.nextInt();

        if(age>=18)
        {
            System.out.println("Eligible to right vote");
        }
        else {
            System.out.println("Not eligible to right vote");
        }
    }
}
