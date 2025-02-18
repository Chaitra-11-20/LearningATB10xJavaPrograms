package ex_21_Static;

public class Lab194_Static_SIB {
    public static void main(String[] args) {
    A a=new A();
    a.method();
        System.out.println(A.num);

    }
}

class A{
    {
        System.out.println("This is not static block");
    }
    static{
        System.out.println("This will load at class loading time");
        System.out.println("This will always load 1st");

    }
    static void method()
    {
        System.out.println("This will run after creating the obj");
    }
    static int num=29;
}

