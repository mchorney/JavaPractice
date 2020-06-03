package home89;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Hom89 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 6, 7, 8};
        System.out.println(sum_of_array(numbers));


        int[] arr={3,9,1,8,4,8,5};
        System.out.println(" ");
        sort(arr);


        int[] array={3,9,1,8,4,8,5};
        int result=max(array);
        System.out.println(result);


    }

    public static int sum_of_array(int[] xx) {
        int sum = 0;
        for (int v : xx) {
            sum += v;
        }
        return sum;
    }


    public static void sort(int[]yy){
        Arrays.sort(yy);
        for(int v:yy){
            System.out.println(v);
        }
    }


    public static int max(int[]xx){
        int i=xx[0];
        for(int v:xx){
            if(v>i){
                i=v;
            }
        }
        return i;
    }






}