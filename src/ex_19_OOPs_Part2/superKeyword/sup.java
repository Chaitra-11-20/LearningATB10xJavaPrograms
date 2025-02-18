package ex_19_OOPs_Part2.superKeyword;

public class sup {
    public static void main(String[] args) {
son s1=new son();
s1.s();
    }
}
class Fath{

    Fath()
    {
        System.out.println("i have gold");
    }

    Fath(int a)
    {
        System.out.println(a);
    }
     int money=9;

    void home()
    {
        System.out.println("I have home");
    }
}
class son extends Fath{

    son()
    {
        super(10);

    }

    void s() {
        super.home();
        System.out.println(super.money);

    }

}
