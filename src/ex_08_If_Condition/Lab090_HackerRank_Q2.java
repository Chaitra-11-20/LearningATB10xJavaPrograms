package ex_08_If_Condition;

import java.util.Scanner;

public class Lab090_HackerRank_Q2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 1st lenth of side1:");
        double side1=scan.nextDouble();
        System.out.println("Enter 1st lenth of side1:");
        double side2=scan.nextDouble();
        System.out.println("Enter 1st lenth of side1:");
        double side3=scan.nextDouble();

        if(side1<=0 || side2<=0 || side3<=0)
        {
            System.out.println("Enter positive values");
        }
        else
            if(side1==side2 && side2==side3 && side3==side1)
            {
                System.out.println("its equi triangle");
            }
            else if(side1==side2 || side2==side3 || side3==side1)
            {
                System.out.println("Isoscale");
            }
            else {
                System.out.println("not equal");
            }
    }
}
