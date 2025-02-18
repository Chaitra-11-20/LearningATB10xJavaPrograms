package ex_20_OOPs_Super_Abstraction;

public class Lab191 {
    public static void main(String[] args) {
        p i=new p();
        o i1=new p();
        i.displayyy();
        System.out.println(i1.value);

    }
}
interface o{

    public int value=10;
    void displayyy();
}
class p implements o{

    @Override
    public void displayyy() {
        System.out.println("Value of a");
        System.out.println(value);
    }
}
