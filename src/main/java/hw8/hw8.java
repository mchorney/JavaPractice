
package hw8;

import java.util.Arrays;

public class hw8 {
    public static void main(String[] args) {
        int[] bb = {2, 3, 5, 6, 7, 8};
        int[] zz = {3, 9, 1, 8, 4, 8, 5};
        int[] pp = {3,9,1,8,4,8,5};


        System.out.println(sum(bb));
        System.out.println(" ");
        sort(zz);
        System.out.println(" ");
        win(pp);

    }


    public static int sum(int[] xx) {
        int mope = 0;
        for (int v : xx) {
            mope += v;
        }
        return mope;

    }

    public static void sort(int[] yy) {
        Arrays.sort(yy);
        for (int x : yy){
            System.out.println(x);
        }
    }
    public static void win(int[] tt){
        int max = tt[0];
        for (int v:tt) {
            if (v>max){
                max=v;
            }
        }
        System.out.println(max);
    }
}