package Homework6;

public class Functions {

    public static void main(String[] args) {
        sumOfTwoIntegers(5, 5);

        int z = sumOfTwoIntegers1(6, 6);
        System.out.println("Second sum of two integers:  " + z);

        boolean check = isOdd(5);
        System.out.println(check);
    }

    //   Создайте метод sum - который в качестве аргумента берет 2 целых числа и печатает их результат на экране.
    //   вызовите этот метод из функции main() (подсказка - тип функции будет void)

    public static void sumOfTwoIntegers(int x, int y) {
        System.out.println("Sum of two integers:  " + x + " and " + y + " will be " + (x + y));
    }

    //   Создайте метод sum - который в качестве аргумента берет 2 целых числа и возвращает их сумму
    //   вызовите этот метод внутри функии main(), сохраните результат в переменной и выведите результат на экран (подсказка - тип функции будет int)

    public static int sumOfTwoIntegers1(int x, int y) {
        return x + y;
    }

    //   Создайте метод isOdd - который в качестве аргумента берет целое число и если оно четное возвращает true
    //   если нечетное - возвращает false
    //   вызовите этот метод внутри функии main(), сохраните результат в переменной и выведите результат на экран

    public static boolean isOdd(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }
}
