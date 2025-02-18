package ex_21_Static;

public class b {
    public static void main(String[] args) {
        System.out.println(Automati.driver);
        System.out.println(Automati.driver2);
        Automati.driver2="Firefox";
        System.out.println(Automati.driver2);
    }
}

class Automati{
    static String driver="Chrome";
    static String driver2;

}

