package ex_07_Increment_Decrement_Op;

public class Chaii_ex {
    public static void main(String[] args) {

        String age_st=args[0];
        int chai_age=Integer.parseInt(age_st);
        System.out.println(chai_age);

        System.out.println(args[1]);
        System.out.println(args[2]);

        String goa=chai_age>28?"you can go":"no";
    }
}
