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

       // int a=10;
      //  int res=(++a + a++ + a++);//11 +11+12=34
       // System.out.println(res);//34
       // System.out.println(a);//13

        /**
         *
         *  int a. = 20
         *
         *            System.out.println(—a + a++ + a—);
         */
        int b=20;
        System.out.println(--b + b++ + b--);//19+19+20=58
        System.out.println(b);//19


    }
}
