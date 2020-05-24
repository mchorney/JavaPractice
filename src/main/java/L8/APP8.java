package L8;

import java.util.Arrays;

public class APP8 {
    public static void main(String[] args) {
        int[] arr1={1,3,7,7};
        int[] arr2={2,5};
        int[] arr3={9,8,7,4,4,5,4,6};
//        System.out.println(summ_of_array(arr1));
//        System.out.println(summ_of_array(arr2));
//        System.out.println(summ_of_array(arr3));
//
//        int[]cc=x2(arr1);
//        System.out.println(Arrays.toString(cc));

        System.out.println(sum_of_two(5,7));
        System.out.println(sum_of_two(5.9,12.5));
        System.out.println(sum_of_two("rrr","dddd"));
    }
    public static int summ_of_array(int[]xx){
        int sum=0;
        for (int v:xx) {
            sum+=v;
        }
        return sum;
    }
    public static int[] x2(int[]arr){
        int[]new_array=new int[arr.length];
        for (int i=0; i<arr.length; i++){
            new_array[i]=arr[i]*2;
        }
        return new_array;
    }

    public static int sum_of_two(int a, int b) {
        return a+b;
    }
    public static String sum_of_two(String a, String b) {
        return a+b;
    }
    public static double sum_of_two(double a, double b) {
        return a+b;
    }
}

