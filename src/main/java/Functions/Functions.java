package Functions;

public class Functions {
    // 1. Создайте метод sum - который в качестве аргумента берет 2 целых числа и печатает их результат на экране.
    // вызовите этот метод из функции main() (подсказка - тип функции будет void)
    private static void sum(int num1, int num2){
        System.out.println(num1 + num2);
    }

    //2. Создайте метод sum - который в качестве аргумента берет 2 целых числа и возвращает их сумму.
    //вызовите этот метод внутри функии main(), сохраните результат в переменной и выведите результат на экран (подсказка - тип функции будет int)
    private static int sum2(int num1, int num2){
        return num1 + num2;
    }

    /*3. Создайте метод isOdd - который в качестве аргумента берет целое число и если оно четное возвращает true
    если нечетное - возвращает false
    вызовите этот метод внутри функии main(), сохраните результат в переменной и выведите результат на экран*/
    private static boolean isOdd(int num){
       return num % 2!=0;
    }

    public static void main(String[] args) {
        sum(24, 37);

        var sum = sum2(34, 23);
        System.out.println(sum);

        var isOdd = isOdd(45);
        System.out.println(isOdd);

    }


}
