package Tasks;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number to find its factorial
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Variable to store the factorial result, starting from 1
        long factorial = 1;

        // Calculate the factorial using a for loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;  // Multiply factorial by i in each iteration
        }

        // Display the result
        System.out.println("Factorial of " + num + " is: " + factorial);

        // Close the scanner
        scanner.close();
    }
    }

