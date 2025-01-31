package Tasks;

public class Samllest_of_two_numbers {
    public static void main(String[] args) {

        int num1= Integer.parseInt(args[0]);
        int num2= Integer.parseInt(args[1]);

        if(num1>num2)
        {
            System.out.println("Num1 is largest and the number is " +num1);
        }
        else if(num2>num1)
        {
            System.out.println("Num2 is largest and the number is " +num2);
        }
        else {
            System.out.println("Both are equal");
        }
    }
}
