package ex_20_OOPs_Super_Abstraction;

public class Cha {
    public static void main(String[] args) {
        gaut g=new gaut();
        g.pen();
        g.pencil();
    }
}

abstract class chaitra{
    abstract void pen();
    abstract void pencil();
}

class gaut extends chaitra{

    @Override
    void pen() {
        System.out.println("Got pen");
    }

    @Override
    void pencil() {
        System.out.println("Got pencil");
    }
}
