package hw89;

import java.util.Arrays;

public class Hom89 {
    public static void main(String[] args) {

//        int[] array={2,3,5,6,7,8};
//        System.out.println(sum_of_array(array));


//        int[] arr={3,9,1,8,4,8,5};
//        System.out.println("\nSorted: \n");
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]+ " ");




//        int[] array={3,9,1,8,4,8,5};
//        for (int i = 0; i < array.length; i++) {
//
//        }
//        double max = array[0];
//        double min = array[0];
//        double avg = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (max < array[i])
//                max = array[i];
//            if (min > array[i])
//                min = array[i];
//            avg += array[i] / array.length;
//        }
//        System.out.println("max = " + max);
//        System.out.println("min = " + min);
//        System.out.println("avg = " + avg);


        int[] array = {2, 3, 5, 6, 7, 8};
        System.out.println(sum_of_array(array));

    }


    public static int sum_of_array(int[] xx) {
        int sum = 0;
        for (int v : xx) {
            sum += v;
        }
        return sum;


    }
}