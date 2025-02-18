package ex_20_OOPs_Super_Abstraction;

public class Lab184_Private {
    public static void main(String[] args) {
    gau g=new gau();
    g.some_method();
    }
}
class chai{
    chai(){

    }
    protected int gold_in_grams=100;
}
class gau extends chai{
    void some_method(){
        System.out.println(super.gold_in_grams);
    }
}
