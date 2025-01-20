package ex_06_Ternary_Operator;

public class Task_chai {
    public static void main(String[] args) {

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        String largest=(a>b)?"a is largest":"b is largest";
        System.out.println(largest);

    }
}
