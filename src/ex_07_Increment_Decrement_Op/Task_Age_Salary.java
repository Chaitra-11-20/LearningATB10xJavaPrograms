package ex_07_Increment_Decrement_Op;

public class Task_Age_Salary {
    public static void main(String[] args) {
        /**
         * Take a user input - Name, Age and Salary and print them in the end.Take a user input - Name, Age and Salary and print them in the end.
         */
       int age=Integer.parseInt(args[0]);//String s=args[0]=>int age=Integer.parseInt(s);
       //int name=Integer.parseInt(args[1]);==we cant define like this becz the input is already a string so no need to convert to string if it is a int we need to convert
        int salary=Integer.parseInt(args[1]);
        String name=args[2];

        System.out.println(age+" "+salary+" "+name);

    }
}
