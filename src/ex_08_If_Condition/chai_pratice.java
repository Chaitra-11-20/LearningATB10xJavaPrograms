package ex_08_If_Condition;

import java.util.Scanner;

public class chai_pratice {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an String name");
        String name=scan.next();

        if(name.equals("abc"))  // dont use name==abc
        {
            System.out.println("Name is correct");
        }
        else {
            System.out.println("Name is not correct");
        }
    }
}
