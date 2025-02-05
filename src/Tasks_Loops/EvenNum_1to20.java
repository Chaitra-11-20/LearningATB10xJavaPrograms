package Tasks_Loops;

public class EvenNum_1to20 {
    public static void main(String[] args) {
        for(int i=2;i<=20;i+=2)
        {
            System.out.println(i);
        }

        for(int j=1;j<=20;j++)
        {
            if(j%2==0)
            {
                System.out.println(j);
            }
        }
    }
}
