package ex_19_OOPs_Part2;

public class Task {
    public static void main(String[] args) {
        PrintMyBook p=new PrintMyBook();
        p.getdetails("Harry Potter", "J.k. Rowling", 120);
    }
}

abstract class book{

    abstract void getdetails(String name, String  author, int price);
}

class PrintMyBook extends book{

    @Override
    void getdetails(String name, String author, int price) {
        System.out.println(name+" "+author+" "+price);
    }
}