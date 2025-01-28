package ex_13_Functions.java.lang;

public class pal {
    public static void main(String[] args) {
        String name="naman";
        String reversed="";

        name=name.toLowerCase();
        for(int i=name.length()-1;i>=0;i--)
        {
            reversed=reversed+name.charAt(i);

        }
        if(name.equals(reversed))
        {
            System.out.println("its a palindrome");
        }
        else{
            System.out.println("Its not a palindrome");
        }
    }
}
