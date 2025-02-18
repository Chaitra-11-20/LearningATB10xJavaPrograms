package ex_21_Static;

public class Lab192_Static {
    public static void main(String[] args) {
student s1=new student(10);
        student s2=new student(20);
        System.out.println(s1.marks);
        System.out.println( s2.marks);
        System.out.println(student.course);
        student.this_is_method();
    }
}
class student{

    int marks;
    static String course="ATB 10X";

    public  student(int my_marks){
        this.marks=my_marks;
    }

    static  void this_is_method(){
        System.out.println("i joined the course in 2024");
    }
}
