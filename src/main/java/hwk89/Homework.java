package hwk89;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int[] numbers = {2,3,5,6,7,8};
        System.out.println(sum(numbers));

        int[] nums = {3,9,1,8,4,8,5};
        sort(nums);

        System.out.println(minmax(nums));
        System.out.println(max(nums));
    }

    public static int sum(int[] a){
        int sum = 0;
        for (int num:a){
            sum +=num;
        }
        return sum;
    }

    public static void sort(int[] a){
        //Arrays.sort(a);
        //System.out.println(Arrays.toString(a));
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a.length; j++){
                int temp = 0;
                if (a[i]<a[j]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static String minmax(int[] a){
        int min = a[0];
        int max = a[0];
        for (int num : a){
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }
        return max + "/" + min;

    }

    public static int max(int[] a){
        int max = a[0];
        for (int num : a){
            if (num > max){
                max = num;
            }

        }
        return max;

    }
}
