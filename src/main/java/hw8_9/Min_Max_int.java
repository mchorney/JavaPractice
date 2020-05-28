package hw8_9;

public class Min_Max_int {
    public static void main(String[] args) {
        //        3. Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
//(группа мак - макчимальное/ группа min - минимальное)
//подайте в качестве параматра {3,9,1,8,4,8,5}

        int[] numbers = new int[]{3, 9, 1, 8, 4, 8, 5};
        int max = Max(numbers);
        System.out.println(max);

        int[] num = new int[]{3, 9, 1, 8, 4, 8, 5};
        int min = Min(num);
        System.out.println(min);

    }
//Maximum
    public static int Max(int[] numbers) {
        int maxNumber = numbers[0];
        for (int h = 1; h < numbers.length; h++) {
            if (numbers[h] > maxNumber) {
                maxNumber = numbers[h];
            }
        }
        return maxNumber;
    }
// Minimum
    public static int Min(int[] num) {
        int minNumber = num[0];
        for (int y = 0; y < num.length; y++) {
            if (num[y] < minNumber) {
                minNumber = num[y];
            }
        }
        return minNumber;
    }

}
