package ex_18_OOPs_Constructors;

public class Lab162_OOPs {
    public static void main(String[] args) {
        baby b=new baby();
        System.out.println(b.name2);
    }
}
class baby
{
    String name;
    String name2="Chai";

    baby()
    {
        System.out.println("My name is baby");
    }
    {
        System.out.println("I am a static block");
    }
}
