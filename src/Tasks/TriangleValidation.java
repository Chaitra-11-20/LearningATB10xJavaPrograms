package Tasks;


import java.util.Scanner;

public class TriangleValidation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input for three sides
            System.out.print("Enter side 1: ");
            int side1 = scanner.nextInt();
            System.out.print("Enter side 2: ");
            int side2 = scanner.nextInt();
            System.out.print("Enter side 3: ");
            int side3 = scanner.nextInt();

            // Check if sides form a valid triangle
            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                System.out.println("Sides must be positive numbers.");
            } else if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                System.out.println("The triangle is valid.");
            } else {
                System.out.println("The triangle is not valid.");
            }

            scanner.close();
        }
    }
