package Tasks_Loops;

public class While_Even_1to20 {
    public static void main(String[] args) {

        int i=0;

        while(i<=20)
        {
            System.out.println(i);
           i=i+2;
        }

        int j=1;

        while(j<=20)
        {
            if(j%2==0)
            {
                System.out.println(j);
            }
            j++;
        }
    }
}
