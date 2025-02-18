package ex_20_OOPs_Super_Abstraction;

public class hsd {
    public static void main(String[] args) {
cchaitra b =new cchaitra();
b.div();
b.shwetha();
b.swathi();
b.clg();
    }
}
   interface home_town{
      void shwetha();
      void swathi();
   }

   interface smg{

    void div();
    default void clg()
    {
        System.out.println("PESTIM");
    }
   }

    class cchaitra implements home_town,smg{

       @Override
       public void shwetha() {
           System.out.println("Best");
       }

       @Override
       public void swathi() {
           System.out.println("Good");
       }

       @Override
       public void div() {
           System.out.println("fav");
       }
   }