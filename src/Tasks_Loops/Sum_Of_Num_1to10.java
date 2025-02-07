package Tasks_Loops;

public class Sum_Of_Num_1to10 {
    public static void main(String[] args) {
        int sum=0;

        for(int i=1;i<=100;i++)
        {
            //System.out.println(i);
            sum=sum+i;
        }
        System.out.println(sum);

        System.out.println("============");

        int k=1;
        int SUM1=0;
        while(k<=100)
        {
           //System.out.println(k);
            SUM1=SUM1+k;
          k++;
        }
        System.out.println(SUM1);
    }
}
