package l8_9;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class HomeWork8_9 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 6, 7, 8};
        int[] arr2 = {3, 9, 1, 8, 4, 8, 5};
        System.out.println(max(arr1));
        System.out.println(max(arr2));
        System.out.println(min(arr1));
        System.out.println(min(arr2));
//    }
//        int[] cc = sort(arr1);
//        for (int v : cc) {
//            System.out.println(v);
//        }
        System.out.println(sum(arr1));
        System.out.println(sum(arr2));
    }
    public static int sum(int[] arr){
        int sum=0;
        for (int v:arr){
              sum+=v;}
            return sum;
        }
        public static int max(int[] arr){
            int max=arr[0];
            for (int v:arr){
               if(v>max){
                   max=v;
               }
            }
            return max;
        }
        public static int min(int[] arr){
        int min=arr[0];
            for (int v:arr){
                if(v<min){
                    min=v;
                }
            }
            return min;
        }

//         public static int[] sort(int[] arr){
//            int[] new_arr = new int[arr.length];
//            int max = arr[0];
//            for (int i = 0;i < arr.length;i++) {
//                if(arr[]>=max){
//                    max=new_arr[arr.length-1];
//                }
//            }
//            return new_arr;
//        }
    }

