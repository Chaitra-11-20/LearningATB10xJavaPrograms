package ex_13_Functions.java.lang;

public class Assignment_try {
    public static void main(String[] args) {
        String s="Chaitra";
       int  vow=0;
        int cons=0;

        s=s.toLowerCase();

        for(int i=1;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (c=='a'|| c=='e'||c=='i'||c=='0'||c=='u')
            {
                vow++;
            }
            else if(Character.isLetter(c))
            {
                cons++;
            }
        }
        System.out.println("Vow" +vow);
        System.out.println("Cons "+cons);
    }
}
