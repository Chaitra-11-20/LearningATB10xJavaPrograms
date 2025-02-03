package ex_15_Strings_Functions;

import java.sql.SQLOutput;

public class Lab141_String_Functions {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length());
        // 1. charAt()
    System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10)); // StringIndexOutOfBoundsException

        // 2. concat()
        System.out.println(name.concat(" Patel"));
        // 3. contains()
        System.out.println(name.contains("om"));//false
        System.out.println(name.contains("on"));//true
        // 4. equals()
        System.out.println(name.equals("Sonal"));//true
        System.out.println(name.equals("sonal"));//false
        System.out.println(name.equalsIgnoreCase("sonAl"));//true
        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));//true
        // 6. indexOf() //  sonal -> ? o
        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));
// 7. length()
        System.out.println(name.length());
        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));
        System.out.println(name.replace('l','D'));

        // 9. split()

        String name4 = "pramod@live.com@123";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);


        String name11="Chaitrachidanand2811@gmail.com";
        String[] splits=name11.split("28");//Chaitrachidanand[0] and 11@gmail.com[1]
        String[] next_split=splits[0].split("achi",2);//chaitr (achi) danand
        System.out.println(next_split[0]);
        System.out.println(next_split[1]);
       // System.out.println(splits[0]);
       // System.out.println(splits[1]);

        System.out.println(" ---");

        // 10. substring( , )
        //Sonal
        System.out.println(name.substring(1, 3)); //Sonal//01234-on--1 to 2
        String ss = "hamburger";//012345678--u to e --4 to 7
        System.out.println(ss.substring(4,8));//always we can reduce one number of last digit
        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());
        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        System.out.println("ChHAITRA".toLowerCase());
        // 14. startsWith()
        System.out.println(name.startsWith("s"));//false//case sensitive
        System.out.println(name.startsWith("S"));//true//case sensitive

        // 15. endsWith()
        System.out.println(name.endsWith("l"));//true
        System.out.println(name.endsWith("a"));//false

        // 17. trim()
        String name3 = "    Sonal Harish     ";
        System.out.println(name3.trim());

        String s9="   Chaitra  ";
        System.out.println(s9.trim());

        // 18. compareTo()
        System.out.println(name.compareTo("Sonal"));

        // 19. compareToIgnoreCase()
       System.out.println(name.compareToIgnoreCase("sonal"));

        StringBuilder stringBuilder = new StringBuilder("Sonal");
        stringBuilder.append("Patel");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" It's my World!");
        System.out.println(sb.toString());











    }

}
