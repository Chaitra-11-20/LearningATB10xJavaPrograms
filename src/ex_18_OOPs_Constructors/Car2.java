package ex_18_OOPs_Constructors;

public class Car2 {
   // public static void main(String[] args) {


    String model;
    int year;
//Car2 c=new Car2();
    Car2()
    {
        model="Model N";
         year=3;
    }

    Car2(String car_model, int Car_age)
    {
        this.model=car_model;
        this.year=Car_age;
    }
}
