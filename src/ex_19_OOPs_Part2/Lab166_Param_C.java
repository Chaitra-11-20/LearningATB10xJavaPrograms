package ex_19_OOPs_Part2;

public class Lab166_Param_C {
    public static void main(String[] args) {
        Mobile oppo =new Mobile("Oppo","2018");
        Mobile iphone=new Mobile("Iphone", "2019");
        System.out.println(oppo.model_name+" "+oppo.year_of_launch);
        iphone.display();
        String model=iphone.give_me_model_name();
        System.out.println(model);
    }
}
class Mobile{
    String model_name;
    String year_of_launch;

    Mobile(String model_name_c,String year_of_launch_c){
        this.model_name = model_name_c;
        this.year_of_launch = year_of_launch_c;
    }

    void display(){
        System.out.println(this.model_name + " - "+ this.year_of_launch);
    }

    String give_me_model_name(){
        return this.model_name;
    }


}
