package ex_06_Ternary_Operator;

public class GradeCalculator {
    public static void main(String[] args) {
        int marks=-69;
/**
 * A: 90-100
 *
 * B: 80-89
 *
 * C: 70-79
 *
 * D: 60-69
 *
 * F: 0-59
 */
        String result= (marks>=90 && marks<=100)?"A":(marks>=80 && marks<=89)?"B":(marks>=70 && marks<=79)?"C":(marks>=60 && marks<=69)?"D":(marks>=0 && marks<=59)?"Fail":"Invalid";
        System.out.println(result);
    }
}
