package Tasks_Loops;

public class Inverted_Right_angle_triangle {
    public static void main(String[] args) {

        int rows=10;

        for(int i=rows;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }//https://github.com/prasad291024/LearningATB10xJavaPrograms/blob/master/src/Task7thFeb/InvertedRightAngleTriangle_WhileLoop.java
}
