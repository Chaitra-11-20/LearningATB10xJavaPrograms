package ex_20_OOPs_Super_Abstraction;

public class car {
    public static void main(String[] args) {
     cccc j=new cccc();
     j.automatic();
     j.my_car();
     j.some_method();

    }
}
    interface telsa
    {
//        telsa()
//        {
// not able to create constructor in interface
//        }

        void automatic();//no need to add abstract word before interface becz its always static final and public and we cannot able to create concrete class in interface
//         void auto(){
//            System.out.println("CAR IS AUTOMATIC");
//        }
    }

    abstract class engine{

    void my_car()
        {
            System.out.println("Car started ");
        }

        abstract void some_method();
    }

    class cccc extends engine implements telsa{

        @Override
        void some_method() {
            System.out.println("CAr is parked");
        }

        @Override
        public void automatic() {
            System.out.println(" Its from interface");
        }


    }