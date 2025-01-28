package ex_13_Functions.java.lang;

public class FizzBuzz_Test {
    public static void main(String[] args) {
        //int num=1;

        for(int i=1;i<=100;i++)
        {
            if(i%3==0)
            {
                System.out.println( "Divisible by three  "+i);
            }
            else {
                System.out.println("Not divisible by 3 "+i);
            }

        }
        for(int j=1;j<=100;j++)
        {
            if(j%5==0)
            {
                System.out.println("DIVISIBLE BY 5 " +j);
            }
            else {
                {
                    System.out.println("NOT DIVISIBLE BY 5 " +j);
                }
            }

        }
        for(int k=1;k<=100;k++){
            if(k%3==0 && k%5==0){
                System.out.println("Divisible by both 3 and 5 " +k);

            }
            else {
                System.out.println("NOT Divisible by both 3 and 5 " +k);
            }
        }

        {

        }
    }
}
