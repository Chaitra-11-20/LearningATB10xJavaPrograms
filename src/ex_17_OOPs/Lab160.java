package ex_17_OOPs;

public class Lab160 {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="vhja";
        s.age=78;
        System.out.println(s.name);
    }
}
class Student{
    String name;
    int age;
}
