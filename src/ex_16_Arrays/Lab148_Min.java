package ex_16_Arrays;

public class Lab148_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

       int output= min_value(array);
        System.out.println(output);
    }

     static int min_value(int[] a)
     {
         int min=a[0];
         for(int i=0;i<a.length;i++)
         {
             if(a[i]< min)
                 min=a[i];
         }
         return min;
     }

}
