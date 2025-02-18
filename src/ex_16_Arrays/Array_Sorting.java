package ex_16_Arrays;

import java.util.Arrays;

public class Array_Sorting {
    public static void main(String[] args) {
        int[] array={12, 34, 10, 1, 100, 3, 4, 32};
    for(int i=0;i<array.length;i++) {
        Arrays.sort(array);
        System.out.println(array[i]);
    }
        System.out.println("-==============");
        System.out.println(array[1]);
    }
}
