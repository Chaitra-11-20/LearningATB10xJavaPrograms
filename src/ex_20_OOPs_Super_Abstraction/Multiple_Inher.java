package ex_20_OOPs_Super_Abstraction;

public class Multiple_Inher {
    public static void main(String[] args) {
son s=new son();
s.ex();
s.extra();
s.father_money();
s.mom_money();
    }
}
interface fatherr{
    void father_money();
    void extra();
}

interface mom{
    void mom_money();
    void ex();
}

class son implements fatherr,mom{

    @Override
    public void father_money() {
        System.out.println("pappa");
    }

    @Override
    public void extra() {
        System.out.println("pappa_Extra");
    }

    @Override
    public void mom_money() {
        System.out.println("mom");
    }

    @Override
    public void ex() {
        System.out.println("mom_ex");
    }
}
