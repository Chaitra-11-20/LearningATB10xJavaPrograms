package ex_06_Ternary_Operator;

public class Lab068_AgeClassification_chao {
    public static void main(String[] args) {

        String Chai_age=args[0];
        int age=Integer.parseInt(Chai_age);
        System.out.println(age);

        String result=age<18? "minor":(age>60)?"Adult":"Senior";
        System.out.println(result);

    }
}
