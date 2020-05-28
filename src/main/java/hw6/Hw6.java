package hw6;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class Hw6 {
    public static void main(String[] args) {
        sumoftwonumbers(72, 37);
        int zz = sum2(69, 74);
        System.out.println(zz);

        System.out.println(isEven(58));
    }

    public static void sumoftwonumbers(int a, int b) {
        System.out.println(a + b);

    }

    public static int sum2(int a, int b) {
        return a + b;

    }

    public static boolean isEven(int xx) {
        return xx % 2 == 0;


    }


}














