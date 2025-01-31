package Tasks;

import java.util.Scanner;

public class Smallest_Of_three_numbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int First_num= scan.nextInt();
        System.out.println("Enter the 2nd number");
        int Second_num= scan.nextInt();
        System.out.println("Enter the 3rd number");
        int Third_num= scan.nextInt();

        int smallest=(First_num<Second_num)?((First_num<Third_num)?First_num:Third_num):((Second_num<Third_num)?Second_num:Third_num);
        System.out.println("Smallest number is " +smallest);
    }
}
