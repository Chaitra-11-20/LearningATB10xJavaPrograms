package Tasks;

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter credit score: ");
        int creditScore = scanner.nextInt();

        // Validate age
        if (age <= 0 || age < 18 || age > 80) {
            System.out.println("Invalid age. Age must be between 18 and 80.");
            scanner.close();
            return;
        }

        // Validate salary
        if (salary <= 0) {
            System.out.println("Invalid salary. Salary must be a positive number.");
            scanner.close();
            return;
        }

        if (salary < 30000) {
            System.out.println("Salary is below the minimum threshold. Minimum salary should be ₹30,000.");
            scanner.close();
            return;
        }

        // Validate credit score
        if (creditScore <= 0 || creditScore < 650 || creditScore > 850) {
            System.out.println("Invalid credit score. Credit score must be between 650 and 850.");
            scanner.close();
            return;
        }

        // Check eligibility
        if (age >= 18 && age <= 80 && salary >= 30000 && creditScore >= 650) {
            System.out.println("Congratulations! You are eligible for the loan.");
        } else {
            System.out.println("You are not eligible for the loan.");
        }

        scanner.close();
    }
}