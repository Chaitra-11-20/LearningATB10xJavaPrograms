package ex_15_Strings_Functions;

public class Lab143_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        // String - > 90%
        // StringBuilder -> 5-7% (Thread safty - we avoid it)
        // ThreadLocal -> Multi Threading ->


        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.append("Sharma");
        System.out.println(stringBuilder);

        stringBuilder.append(" World!"); // Modifies sb to "Hello World!"
        System.out.println(stringBuilder); // Output: Hello World!


        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);

        String name = "sonal";
        name = "patel";
        name = "sonalpatel";
        name = "sonal"; // SCP
        System.out.println(name);

        String s8 = "Sonalpatel";
        System.out.println(s8.lastIndexOf("a"));

        String s9 = "Sonalpatel";
        System.out.println(s9.replace("a","x"));
        System.out.println(s9.replaceAll("a","z"));

        String original = "banana";
        String result1 = original.replace('a', 'o');
        System.out.println(result1);

        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "-");
        System.out.println(result2);


        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3);

    }
}
