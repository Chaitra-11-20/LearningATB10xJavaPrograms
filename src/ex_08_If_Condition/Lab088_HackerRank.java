package ex_08_If_Condition;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lab088_HackerRank {
    public static void main(String[] args) {


        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F)
        // based on the following grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59


        // Logic Building - Java (Copyright by Pramod Sir :D )


        // Step 1
        // Find the inputs / outputs
        // Input | score -> (0 - 100) | data type -> int
        // Output | grade -> data type -> char

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the score");
        int score=scan.nextInt();
        char grade = 'A';

        if(score>=90 && score<=100){
            grade='A';
        }

        else if(score>=80 && score<=89) {
            grade = 'B';
        }
        else if(score>=70 && score<=79) {
            grade = 'C';
        }
        else if(score>=60 && score<=69) {
            grade = 'D';
        }
        else if
            (score >= 0 && score <= 59)
        {
            grade = 'F';
        }
        else {
            System.out.println("invalid");
        }
        System.out.println("Grade is "+grade);

    }

}
