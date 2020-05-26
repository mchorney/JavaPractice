package l8_9;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class HomeWork8_9 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 6, 7, 8};
        int[] arr2 = {3, 9, 1, 8, 4, 8, 5};
        sort(arr2);
        System.out.println("Max arr1 - "+max(arr1));
        System.out.println("Max arr2 - "+max(arr2));
        System.out.println("Min arr1 - "+min(arr1));
        System.out.println("Min arr2 - "+min(arr2));
        System.out.println("Summa arr1 - "+sum(arr1));
        System.out.println("Summa arr2 - "+sum(arr2));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int v : arr) {
            sum += v;
        }
        return sum;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int v : arr) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int v : arr) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    public static void sort(int[] arr) {
        Arrays.sort(arr);
        for (int v : arr) {
            System.out.println(v);
        }
    }
}

