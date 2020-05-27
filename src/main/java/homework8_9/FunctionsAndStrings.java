package homework8_9;
import java.util.Arrays;

public class FunctionsAndStrings {
    static int min;
    static int max;

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8};
        System.out.println("Sum of arrays's numbers equals: " + sumOfArraysNumbers(arr));

        int[] sort_arr = {3, 9, 1, 8, 4, 8, 5};
        sort(sort_arr);
        for (int i : sort_arr) {
            System.out.print(" " + i);
        }
        int[] sort_array_1 = {3, 9, 1, 8, 4, 8, 5};
        max_min(sort_array_1);
        System.out.println("\nmin: " + min + " max: " + max);
    }
    /*Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
    вызовите этот метод из функции main() - подайте в качестве параматра {2,3,5,6,7,8}
     */
    public static int sumOfArraysNumbers(int[] arr) {
        int sum = 0;
        for (int v : arr) {
            sum = sum + v;
        }
        return sum;
    }
    /* Создайте метод sort - который в качестве аргумента берет int[] и выводит на экран сортированную последовательность по возрастанию.
    вызовите этот метод внутри функии main()
    подайте в качестве параматра {3,9,1,8,4,8,5}
     */
    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }

    /* Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
    (группа мак - макчимальное/ группа win - минимальное)
    подайте в качестве параматра {3,9,1,8,4,8,5}
     */
    public static void max_min(int my_array[]){
        max = my_array[0];
        min = my_array[0];
        int length = my_array.length;

        for(int i = 1; i < length - 1; i++) {
            if (my_array[i] > max) {
                max = my_array[i];
            } else if (my_array[i] < min) {
                min = my_array[i];
            }
        }
    }
}
