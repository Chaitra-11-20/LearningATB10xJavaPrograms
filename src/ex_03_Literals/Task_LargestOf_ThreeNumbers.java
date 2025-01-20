package ex_03_Literals;

public class Task_LargestOf_ThreeNumbers {
    public static void main(String[] args) {
        /**
         *
         * Finding the Largest of Three Numbers a,b,c using the Ternary Operator.
         */

        int a=10;
        int b=15;
        int c=16;

        String largest=(a>b)?((a>c)?"a is largest":"c is largest"):(b>c)?"b is largest":"c is largest";
        System.out.println(largest);


        //https://github.com/Chaitra-11-20/LearningATB10xJavaPrograms/blob/main/src/ex_03_Literals/Task_LargestOf_ThreeNumbers.java





    }

}
