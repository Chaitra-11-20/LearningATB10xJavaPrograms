package Tasks;

public class ReverseAString {
    public static void main(String[] args) {
     int num=12345;
    int  reverse=0;

    while(num>0)
    {
        int digit=num%10;  //12345%10=5 //1234%10=4 //123%10=3
        reverse=reverse*10+digit ;//5*0+5=5 //5*10+4=54 //54*10+3=543
       num=num/10 ;//12345/10=1234 //1234/10=123 //123/10=12
    }
        System.out.println(reverse);
    }
}
