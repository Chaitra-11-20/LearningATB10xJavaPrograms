package ex_16_Arrays;

import java.util.Arrays;

public class Second_Largest {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
