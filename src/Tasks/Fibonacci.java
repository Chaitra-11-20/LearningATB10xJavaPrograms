package Tasks;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // First two terms
        int a = 0, b = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Loop to generate the Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            // Generate the next term by adding the previous two terms
            int nextTerm = a + b;
            a = b;  // Move b to a
            b = nextTerm;  // Move nextTerm to b
        }

        scanner.close();  // Close the scanner
    }
    }

