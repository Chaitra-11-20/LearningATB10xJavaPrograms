package ex_16_Arrays;

public class Lab154_ForEach {
    public static void main(String[] args) {
        int[] a= new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("----------------------");
        for(int z:a)
        {
            System.out.println(z);
        }
        System.out.println("----------------------");
        String[] name=new String[4];
        name[0]="Chai";
        name[1]="Chaiaa";
        name[2]="Chaitra";
        name[3]="Chidanand";


        for (String names:name)
        {
            System.out.println(names);
        }
        System.out.println("----------------------");

        for(int i=0;i<name.length;i++)
        {
            System.out.println(name[i]);
        }
    }
}
