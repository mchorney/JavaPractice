package Lesson8_9;
//1. Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
//вызовите этот метод из функции main() - подайте в качестве параматра {2,3,5,6,7,8}
//2. Создайте метод sort - который в качестве аргумента берет int[] и выводит на экран сортированную последовательность по возрастанию.
//вызовите этот метод внутри функии main()
//подайте в качестве параматра {3,9,1,8,4,8,5}
//3. Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
//(группа мак - макчимальное/ группа win - минимальное)
//подайте в качестве параматра {3,9,1,8,4,8,5}

import java.util.Arrays;


public class Homework8_9 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 6, 7, 8};
        System.out.println(arr_sum(arr1));

        int[] arr2 = {3,9,1,8,4,8,5};
        sort(arr2);

        int[] arr3 = {3, 9, 1, 8, 4, 8, 5};
        int max = getMax(arr3);
        System.out.println("Maximum Value of arr3 is: "+max);

        int min = getMin(arr3);
        System.out.println("Minimum Value of arr3 is: "+min);
    }

    public static int arr_sum(int[]a){
        int sum=0;
        for (int v:a){
            sum+=v;
        }
        return sum;
    }

    public static void sort(int[] arr2){
        Arrays.sort(arr2);

        System.out.printf("Ascending arr2[] : %s",
                Arrays.toString(arr2));

        //Arrays.sort(arr2, Collections.reverseOrder());

        //System.out.printf("Descending arr[] : %s",
        //        Arrays.toString(arr2));

    }

    public static int getMax(int[] arr3){
        int max = arr3[0];
        for(int i=1;i < arr3.length;i++){
            if(arr3[i] > max){
                max = arr3[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr3){
        int min = arr3[0];
        for(int i=1;i<arr3.length;i++){
            if(arr3[i] < min){
                min = arr3[i];
            }
        }
        return min;
    }
}



