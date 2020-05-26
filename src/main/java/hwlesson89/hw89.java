package hwlesson89;

import java.util.Arrays;

public class hw89 {
        public static void main(String[]args){
            int[] arr_num1 = {2,3,5,6,7,8};
            int[] arr_num2 = {3,9,1,8,4,8,5};
            System.out.println("Sum of the integers for exercise #1:\n" +sum(arr_num1));
            System.out.println("----------------------------------------------------------------------");
            System.out.println("The given array of integers for exercise #2:\n"+Arrays.toString(arr_num2));
            my_sort(arr_num2);
            System.out.println("----------------------------------------------------------------------");
            int[] result= max_min(arr_num2);
            System.out.println("Solution for Exercise #3\nMIN Value of the array is :" +result[0]+"    MAX Value of the array is: "  +result[1]);
            System.out.println("----------------------------------------------------------------------");

        }
        public static int sum(int[] arr_num){

            int result=0;
            for (int v:arr_num){
                result+=v;
            }
            return result;
        }

        public static void my_sort(int[] arr_num){
            for (int i=0;i<arr_num.length-1;i++){
                int min =i;
                for (int j=i+1;j<arr_num.length;j++){
                    if (arr_num[j]< arr_num[min]){
                        min =j;
                    }
                }
                if (min !=i){
                    int temp =arr_num[i];
                    arr_num[i] = arr_num[min];
                    arr_num[min] = temp;
                }
            }

            System.out.println("Sorted array of integers for exercise #2" + Arrays.toString(arr_num));


        }

        public static int[] max_min(int[] arr_num){
            //I understand that this way is not the preferred and the best way is to use the generic Pair class
            Arrays.sort(arr_num);
            //int []sorted_arr=my_sort(arr_num);
            int min=arr_num[0];
            int max=arr_num[arr_num.length-1];
            return new int[] {min,max};

        }


}
