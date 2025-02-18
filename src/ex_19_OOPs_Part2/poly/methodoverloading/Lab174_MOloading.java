package ex_19_OOPs_Part2.poly.methodoverloading;

public class Lab174_MOloading {

    void num()
    {
        System.out.println("no num");
    }

    void num(int a, int b)
    {
        System.out.println(a+b);
    }

    void num(double a, double b, int c)
    {
        System.out.println(a+b+c);
    }
}
