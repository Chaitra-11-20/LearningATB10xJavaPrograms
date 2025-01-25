package ex_09_Switch;

import java.util.Scanner;

public class Lab099_Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name");
        String name=scanner.next();
        System.out.println("Enter the age");
        int age= scanner.nextInt();
        System.out.println("Enter the Salary");
        int Salary=scanner.nextInt();

        System.out.println("Name is"+name);
        System.out.println("Age is"+age);
        System.out.println("Salary is"+Salary);

    }
}
