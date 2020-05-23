package hw6;

public class Methods {

    public static void main(String[] args) {

        Methods.printSum(3, 2);

        int sum = getSum(4, 6);
        System.out.println("Task 2. Sum of 2 integers = " + sum);

        boolean result = Methods.isOdd(7);
        System.out.println("Task 3. Is integer odd? Result: " + result);
    }

    // Создайте метод sum - который в качестве аргумента берет 2 целых числа и печатает их результат на экране.
    // вызовите этот метод из функции main() (подсказка - тип функции будет void)

    public static void printSum(int num1, int num2) {
        System.out.println("Task 1. Sum of 2 integers = " + num1 + num2);
    }

    // Создайте метод sum - который в качестве аргумента берет 2 целых числа и возвращает их сумму.
    // вызовите этот метод внутри функии main(), сохраните результат в переменной и выведите результат на экран
    // (подсказка - тип функции будет int)

    public static int getSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // Создайте метод isOdd - который в качестве аргумента берет целое число и если оно четное возвращает true
    // если нечетное - возвращает false
    // вызовите этот метод внутри функии main(), сохраните результат в переменной и выведите результат на экран

    public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
