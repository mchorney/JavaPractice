package hw89;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        int[] a = {2,3,5,6,7,8};
        System.out.println(sum(a));
        int[] b = {3,9,1,8,4,8,5};
        sortWithArray(b);
        //sort(b);
        printArray(b);
        System.out.println(max(b));
        System.out.println(min(b));
    }
    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    public static int[] sort(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
    public static int[] sortWithArray(int[] a) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        Collections.sort(list);
        Integer[] c = new Integer[a.length];
        c = list.toArray(c);
        for (int i = 0; i < a.length; i++) {
            a[i] = c[i];
        }
        return a;
    }
    public static void printArray(int[] xx) {
        for (int i = 0; i < xx.length; i++) {
            if (i == xx.length - 1) {
                System.out.println(xx[i]);
            }else System.out.print(xx[i] + " ");
        }
    }
    public static int max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }
    public static int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}
