package Tasks;

import javax.swing.*;
import java.util.Scanner;

public class Char_is_Albhabet {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any Character");
        char character=scan.next().charAt(0);

        if((character>='A'&& character<='Z') || (character>='a' && character<='z'))
        {
            System.out.println("Its a char");
        }
        else{
            System.out.println("Its not a char");
        }
    }
}
