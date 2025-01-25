package ex_09_Switch;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser=scan.next();

        switch(browser)
        {
            case "chrome":System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC");
                break;
            case "edge":System.out.println("Starting the edge");
                System.out.println("........");
                System.out.println("TC");
                break;
            case "firefox":System.out.println("Starting the firefox");
                System.out.println("........");
                System.out.println("TC");
                break;
            default:
                System.out.println("this is not there");
        }

    }
}
