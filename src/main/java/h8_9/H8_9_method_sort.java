package h8_9;

import java.util.Arrays;

public class H8_9_method_sort {
    public static void main(String[] args) {
        int[] numbers = {3, 9, 1, 8, 4, 8, 5};
        sort(numbers);

    }

    public static void sort(int[] numbers) {
        Arrays.sort(numbers);
        for (int x : numbers) {
            System.out.println(x);
        }
    }
}
