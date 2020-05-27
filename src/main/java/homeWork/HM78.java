package homeWork;

import java.lang.reflect.Array;
import java.util.Arrays;


public class HM78 {
    public static void main(String[] args) {

    int[] one = {2,3,5,6,7,8};
    int[] two = {3,9,1,8,4,8,5};

    System.out.println("Sum of all values in arrays is " + sum(one));

    sort(two);

    maxMin(two);

    System.out.println(MaxMin(two));
    }

    public static int sum(int[] one) {
        int sum = 0;
        for (int i : one) {
            sum += i;
        }
        return sum;
    }

    public static void sort(int[] one) {
        Arrays.sort(one);
        for(int v:one){
            System.out.println(v);
        }
    }

    public static void maxMin(int[] one) {
        Arrays.sort(one);
        int total = one.length -1 ;
        int min = one[0];
        int max = one[total];

        System.out.println("Min value in array is " + min);
        System.out.println("Max value in array is " + max);
    }

    public static String MaxMin(int[] one) {
        Arrays.sort(one);
        int[] two = {one[0],one[one.length-1]};
        return Arrays.toString(two);
    }
}
