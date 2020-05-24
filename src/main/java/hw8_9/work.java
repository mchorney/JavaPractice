package hw8_9;

public class work {
    public static void main(String[]args){
        int[] nums1={2,3,5,6,7,8};
        System.out.println("The sum of all the numbers in the array nums1 is "+sum(nums1));

        int[]nums2={3,9,1,8,4,8,5};
        sort(nums2);

        System.out.println("\nThe minimum number in the array is "+min(nums2));

    }
    //1
    public static int sum(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    //2
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
    //3
    public static int min(int[]arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
