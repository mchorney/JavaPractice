package Lesson8_9;

import java.util.Arrays;
import java.util.List;

public class Lesson8_9 {
    public static void main(String[] args) {

        int sum = sumOfFiveNumbers(5, 55, 14, -69, 87);
        System.out.println(sum);

        String hello = sumOfTwo("Hello", " world!");
        System.out.println(hello);
        System.out.println(sumOfTwo("Hello", " world!"));


        int[] arr1 = {1, 3, 7, 7};
        int[] arr2 = {2, 3};

        System.out.println(sumOfNumbersInArray(arr2));

        int[] cc = x2(arr1);

        for (int v : cc) {
            System.out.println(v);
        }

        System.out.println(sumOfTwo(1, 0.5));
        System.out.println(sumOfTwo("rrr", "sssssss"));
        System.out.println(sumOfTwo(5, 8));

        // Strings are immutable. You can not change Strings using any functions. You can change Strings only making new initialization.

        String str = "Hello, students!";

        int length = str.length();
        System.out.println(length);

        System.out.println(str.length());

        char c = str.charAt(14);
        System.out.println(c);

        String str1 = str.concat("today is a rainy day");

        System.out.println(str1);

        String str2 = str.replace('e', 'E');
        System.out.println(str2);

        int index = str.indexOf("e");
        System.out.println(index);

        boolean cont = str.contains("ello");
        System.out.println(cont);

        str1 = str.toUpperCase();
        System.out.println(str1);

        str1 = str.toLowerCase();
        System.out.println(str1);

        //// замена слов на другие

        String ss = "today is a sunny day and I can see blue skies";
        String sss = "today,is,a,rainy,day,and,I,can not,see,blue,skies";

        String[] ss_array = ss.split(" ");
        String[] sss_array = sss.split(",");

        ss_array[3] = "rainy";
        ss_array[7] = "can not";

        List Ssss = Arrays.asList(ss_array);
        List ssss = Arrays.asList(sss_array);

        str1 = String.join(" ", Ssss);
        str2 = String.join(",", ssss);

        System.out.println(str1);
        System.out.print(str2);

        // две строки в Java можно сравниывть только with equals()

        if (sss.equals(sss)) {
            System.out.println("good");
        }

        System.out.println("hello, students!".toUpperCase());

        // if one String equals another - then res = 0

        int res = str.compareTo(str);
        System.out.println(res);

        // trim() обрезает ненужные пробелы с переди и сзади String -a

        String str22 = str1.trim();
        System.out.println(str22);

        boolean cont1 = str.endsWith("ents!");
        System.out.println(cont1);

        str1 = str.substring(5);
        System.out.println(str1);

        str1 = str.substring(2, 8);
        System.out.println(str1);

        CharSequence str11 = str.subSequence(2, 5);
        System.out.println(str11);

        char[] chars = str.toCharArray();

        //str.isEmpty(); - в строке только пробелы

    }

    public static int sumOfFiveNumbers(int a1, int a2, int a3, int a4, int a5) {

        return a1 + a2 + a3 + a4 + a5;
    }

    public static String sumOfTwo(String str1, String str2) {

        return str1 + str2;
    }

    // перегрузка имен!!!

    public static int sumOfTwo(int str1, int str2) {

        return str1 + str2;
    }

    public static double sumOfTwo(double str1, double str2) {

        return str1 + str2;
    }

    public static int sumOfNumbersInArray(int[] arrayName) {

        int sum = 0;

        for (int v : arrayName) {

            sum += v;
        }
        return sum;
    }

    public static int[] x2(int[] array) {

        //1. Создать новый array  - столько же элементов, сколько в старом

        int[] new_array = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            new_array[i] = array[i] * 2;
        }
        return new_array;
    }
}


