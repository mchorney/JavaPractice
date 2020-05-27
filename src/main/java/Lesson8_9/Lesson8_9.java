package Lesson8_9;

public class Lesson8_9 {
    public static void main(String[] args) {

        var xx =sum_of_5_numbers(5,55,14,-69,87);
        System.out.println(xx);

        String newWord = sum_of_two_Strings("One"," Two");
        System.out.println(newWord);
        System.out.println(sum_of_two_Strings("Three","Four"));


        System.out.println("dddddddddddddddd"+"eeeeeeeeeee"+55);

        int[] arr1 = {1,3,7,7};
        int[] arr2 = {2,3};
        int[] arr3 = {9,8,7,4,4,5,4,6};

//        System.out.println(sum_of_array(arr1));
//        System.out.println(sum_of_array(arr2));
//        System.out.println(sum_of_array(arr3));
//        int[] cc = x2(arr1);
//        for (int v:cc) {
//            System.out.println(v);
//        }

        System.out.println(sum_of_two(1,0.5));
        System.out.println(sum_of_two("rrrr","ffff"));
        System.out.println(sum_of_two(5,8));

    }

    public static String sum_of_two(String str1, String str2){
        return str1+str2;
    }
    public static int sum_of_two(int str1, int str2){
        return str1+str2;
    }
    public static double sum_of_two(double str1, double str2){
        return str1+str2;
    }

    public static int sum_of_5_numbers(int a1,int a2, int a3, int a4, int a5){
        return a1+a2+a3+a4+a5;
    }
    public static String sum_of_two_Strings(String str1, String str2){
        return str1+str2;
    }

    public static int mult_of_array(int[]xx){
        int res=1;
        for (int v:xx) {
            res=v*res;
        }
        return res;
    }
    public static int sum_of_array(int[]xx){
        int sum=0;
        for (int v:xx) {
            sum+=v;
        }
        return sum;
    }

    public static int[] x2(int[]arr){
        int[]new_array = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            new_array[i]=arr[i]*2;
        }
        return new_array;
    }
}
