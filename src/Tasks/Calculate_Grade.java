package Tasks;

import java.util.Scanner;

public class Calculate_Grade {
    public static void main(String[] args) {
        String grade = "A";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a marks");
        int marks=0;
        if (scan.hasNextInt()) {

             marks = scan.nextInt();
        }
        else {
            System.out.println("Enter an Integer value");
            System.exit(0);
        }


            if (marks >= 90 && marks <= 100) {
                grade = "A++";
            } else if (marks >= 80 && marks <= 89) {
                grade = "A";
            } else if (marks >= 70 && marks <= 79) {
                grade = "B";
            } else if (marks >= 60 && marks <= 69) {
                grade = "C";
            } else if (marks >= 50 && marks <= 59) {
                grade = "D";
            } else if (marks > 40 && marks <= 49) {
                grade = "E";
            } else if (marks < 40 && marks > 0) {
                System.out.println("Fail");
                scan.close();
                return;
            } else {
                System.out.println("Invalid marks");
                scan.close();
                return;
            }
            System.out.println("Grade is " + grade);
            scan.close();


        }
    }

