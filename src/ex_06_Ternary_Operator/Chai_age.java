package ex_06_Ternary_Operator;

public class Chai_age {
    public static void main(String[] args) {

        String age_string= args[0];
        int age=Integer.parseInt(age_string);
        System.out.println(age);

        String res=age<18? "Minor":(age>60)?"adu":"sen";
        System.out.println(res);
    }
}
