package ex_09_Switch;

public class cc {
    public static void main(String[] args) {

        String browser="edge";

        switch(browser)
        {
            case "Chrome":
                System.out.println("Ch");
                break;
            case "edge":
                System.out.println("ed");
                break;
            default:
                System.out.println("none");
        }
    }
}
