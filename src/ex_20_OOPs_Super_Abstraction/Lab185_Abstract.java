package ex_20_OOPs_Super_Abstraction;

public class Lab185_Abstract {
    public static void main(String[] args) {
    child c=new child();
    c.marriage_loan();
    c.house_loan();
    }
}

    abstract class father{
       abstract void house_loan();
       void marriage_loan(){
           System.out.println("Paid 30 lakhs");
       }
    }

    class child extends father{

        @Override
        void house_loan() {
            System.out.println("paid 50 lakhs");
        }
    }
