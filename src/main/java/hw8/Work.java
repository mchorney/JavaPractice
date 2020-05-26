package hw8;

public class Work {
    public static void main(String[]args){
        int[] array1 = {2,3,5,6,7,8};
        System.out.println("The sum of all numbers in array1 is "+sum(array1));

        int[] array2 = {3,9,1,8,4,8,5};
        sort(array2);
        System.out.println("\nThe minimun number in array2 is "+min(array2));
        System.out.println("\nThe maximum number in array2 is "+max(array2));

    }
    public static int sum(int[]arr){
        int sumOfArray = 0;
        for (int i=0; i<arr.length; i++){
            sumOfArray = sumOfArray + arr[i];
        }
        return sumOfArray;
    }
    public static void sort(int[]arr){
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr [j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
    public static int min(int[]arr){
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int max(int[]arr){
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
