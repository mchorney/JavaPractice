package Homework8;

import java.util.Arrays;

public class METHOD2 {
    public static void main(String[] args) {
        int[] array = {3, 9, 0, 8, 4, 8, 5};
        System.out.println(Arrays.toString(sort(array)));
        System.out.println(Arrays.toString(sort2(array)));
    }

    public static int[] sort(int[] xx) {
        for (int ind = 0; ind < xx.length; ind++) {
            int value = xx[ind];
            int i = ind - 1;
            for (; i >= 0; i--) {
                if (value < xx[i]) {
                    xx[i + 1] = xx[i];
                } else break;
            }
            xx[i + 1] = value;
        }
        return xx;
    }

    public static int[] sort2(int[] xx) {
        for (int ind = 0; ind < xx.length; ind++) {
            int value = xx[ind];
            int i = ind - 1;
            for (; i >= 0; i--) {
                if (value > xx[i]) {
                    xx[i + 1] = xx[i];
                } else break;
            }
            xx[i + 1] = value;
        }
        return xx;
    }
}
