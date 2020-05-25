package hw8;

import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {

        // Sum of Array

        int[] array1 = {2, 3, 5, 6, 7, 8};
        System.out.println("Task 1. Sum of Array = " + sum(array1));

        // Sort using Arrays.sort()

        int[] array2 = {3, 9, 1, 8, 4, 8, 5};
        Arrays.sort(array2);
        System.out.println("Task 2. Sorted Array (method1): " + Arrays.toString(array2));

        //  Custom Sort

        int[] array3 = {3, 9, 1, 8, 4, 8, 5};
        System.out.println("Task 2. Sorted Array (method2): " + Arrays.toString(sort(array3)));

        // Max and Min

        int[] array4 = {3, 9, 1, 8, 4, 8, 5};
        System.out.println("Task 3. Max of Array = " + max(array4));
        System.out.println("Task 3. Min of Array = " + min(array4));
    }

    /*
    1. Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
    вызовите этот метод из функции main() - подайте в качестве параматра {2,3,5,6,7,8}
    */

    public static int sum(int[] array) {
        int sumOfArray = 0;
        for (int v : array) {
            sumOfArray = sumOfArray + v;
        }
        return sumOfArray;
    }

    /*
        2. Создайте метод sort - который в качестве аргумента берет int[] и выводит на экран сортированную
        последовательность по возрастанию. Вызовите этот метод внутри функии main()
        подайте в качестве параматра {3,9,1,8,4,8,5}
        */

    public static int[] sort(int[] originalArray) {
        int[] modifiedArray = originalArray;
        int[] sortedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            int indexMin = getIndexMin(originalArray);
            sortedArray[i] = originalArray[indexMin];
            modifiedArray[indexMin] = max(originalArray);
        }
        return sortedArray;
    }

    public static int getIndexMin(int[] array) {
        int index = 0;
        int minimum = array[index];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
                index = i;
            }
        }
        return index;
    }

    /*
    3. Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
    (группа мак - макчимальное/ группа win - минимальное)
    подайте в качестве параматра {3,9,1,8,4,8,5}
    */

    public static int max(int[] array) {
        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }

    public static int min(int[] array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }
}
