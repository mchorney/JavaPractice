package Homework8;

public class METHOD2 {
    public static void main(String[] args) {
        int[] array = {3, 9, 0, 8, 4, 8, 5};
        sort(array);
        System.out.println("\n");
        sort2(array);
    }

    public static void sort(int[] xx) {
        for (int ind = 1; ind < xx.length; ind++) {
            int value = xx[ind];
            int i = ind - 1;
            for (; i >= 0; i--) {
                if (value < xx[i]) {
                    xx[i + 1] = xx[i];
                } else break;
            }
            xx[i + 1] = value;
        }
        for (int i : xx) {
            System.out.print(" " + i);
        }
    }

    public static void sort2(int[] xx) {
        for (int ind = 1; ind < xx.length; ind++) {
            int value = xx[ind];
            int i = ind - 1;
            for (; i >= 0; i--) {
                if (value > xx[i]) {
                    xx[i + 1] = xx[i];
                } else break;
            }
            xx[i + 1] = value;
        }
        for (int i : xx) {
            System.out.print(" " + i);
        }
    }
}
