package ex_17_OOPs;

public class Lab161_Cats {
    public static void main(String[] args) {
      Cat c=new Cat();
       c.name="hkjhb";
        System.out.println(c.name);
        c.running();
        System.out.println(c.name1);
    }
}

class Cat {
    String name;
    String name1="kgbjhg";


    void running() {
        System.out.println("Running");
    }
}