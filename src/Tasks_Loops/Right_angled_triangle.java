package Tasks_Loops;

public class Right_angled_triangle {
    public static void main(String[] args) {
        int rows=7;

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("*" );
            }
            System.out.println();
        }
    }
}
