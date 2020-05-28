package Hw8_9;

import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 6, 7, 8};
        System.out.println(sum(numbers));
        System.out.println("*********************");
        int[] numbers1 = {3, 9, 1, 8, 4, 8, 5};
        sort(numbers1);
        System.out.println("*********************");
        int[] numbers3 = {5, 48, 89, 66, 12, -2, 0};
        sort1(numbers3);
        printNumbers(numbers3);
        System.out.println("*********************");
        int[] numbers2 = {3, 9, 1, 8, 4, 8, 5};
        int result = min(numbers2);
        System.out.println(result);

    }

    static int sum(int[] xx) {
        int sum = 0;
        for (int v : xx) {
            sum = sum + v;
        }
        return sum;
    }

    static void sort(int[] xx) {
        Arrays.sort(xx);
        printNumbers(xx);
    }

    static void sort1(int[] xx) {
        while (true) {
            boolean swap = false;
            for (int i = 0; i < xx.length - 1; i++) {
                if (xx[i] > xx[i + 1]) {
                    int tmp = xx[i];
                    xx[i] = xx[i + 1];
                    xx[i + 1] = tmp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    static int min(int[] xx) {
        int i = xx[0];
        for (int v : xx) {
            if (v < i) {
                i = v;
            }
        }
        return i;
    }

    static void printNumbers(int[] xx) {
        for (int v : xx) {
            System.out.print(v+",");
        }
        System.out.println();
    }
}
