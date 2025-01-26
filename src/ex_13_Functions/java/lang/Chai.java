package ex_13_Functions.java.lang;

import java.util.Scanner;

public class Chai {
      static void home() {
          System.out.println("Home Sweet home");//Without argument and without return type
      }
          static void hometown(){
              System.out.println("My hometown is Hsd");

    }
    /// /Without argument and without return type
    ///
    /// @return
    static int pincode()
    {
        return 577527;
    }
    static String hometown_address()
    {
        System.out.println("My address is");
        return "Vinayaka extention";
    }
    /// /with argument and without return type
    ///
    static void sum(int a, int b)
    {
        System.out.println(a+b);
    }

static void details(int age, String name, double salary)
{
    System.out.println("Age is "+age +"\nName is "+name+ "\n Salary is "+salary);
}

    /// /with argument and with return type
    ///
    static String manifest(String word1,String word2)
    {
        return word1+" " +" " +word2;
    }
    public static void main(String[] args) {   //Without argument and without return type
        home();

        hometown();
        int pincode=pincode();
        System.out.println(pincode);
        String address =hometown_address();
        System.out.println("Address is"+address);
        sum(10,20);

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the age");
        int ag=scan.nextInt();
        System.out.println("Enter the name");
        String na=scan.next();
        System.out.println("Enter the salary");
        double sal=scan.nextDouble();

        details(ag,na,sal);
        String m=manifest("Be strong ","Be kind");
        System.out.println(m);
    }

}
