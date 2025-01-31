package Tasks;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Take input from user
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // Check if number is prime
            if (num <= 1) {
                System.out.println(num + " is not a prime number.");
            } else {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;  // Divisible by another number
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(num + " is a prime number.");
                } else {
                    System.out.println(num + " is not a prime number.");
                }
            }

            scanner.close();
        }
    }