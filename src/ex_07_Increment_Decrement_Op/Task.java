package ex_07_Increment_Decrement_Op;

public class Task {
    public static void main(String[] args) {
        /**
         *
         * int a = 10;
         *
         *        System.out.println(++a + a++ + a++);
         *
         *         System.out.println(a);
         *
         *
         */

        int a=10;
        int res=(++a + a++ + a++);//11 +11+12=34
        System.out.println(res);//34
        System.out.println(a);//13

    }
}
