package ex_13_Functions.java.lang;

public class Palindrome {
    public static void main(String[] args) {
        String name="Naman";
        String Reversed="";

        name=name.toLowerCase();
        for(int i=name.length()-1;i>=0;i--)
        {
            Reversed+=name.charAt(i);
        }

        if(name.equals(Reversed))
        {
            System.out.println(Reversed);
            System.out.println("Its a palindrome");

        }
        else{
            System.out.println("its not a palindrome");
            System.out.println(Reversed);
        }

    }
}
