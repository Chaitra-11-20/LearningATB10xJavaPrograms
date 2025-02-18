package ex_19_OOPs_Part2.poly.methodoveridding;

public class Real {
    public static void main(String[] args) {
    chrome c=new chrome();
    c.display();
    c.openBrowser();

    fire f=new fire();
    f.openBrowser();
    }
}
class browser{
    void openBrowser()
    {
        System.out.println("i am open browswer");
    }
}

class chrome extends browser{

    void display()
    {
        openBrowser();
    }
}

class fire extends  browser{

    void openBrowser()
    {
        System.out.println("i am close browser");
    }
}