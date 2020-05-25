package HW7;

public class sum_int {
    public static void main(String[] args) {
        System.out.println(sumOfThreeNumbers(1, 1, 1));

    }
    //    2. Создайте метод sum - который в качестве аргумента берет 2 целых числа и возвращает их сумму.
//вызовите этот метод внутри функии main(), сохраните результат в переменной и выведите результат на экран (подсказка - тип функции будет int)
    public static int sumOfThreeNumbers(int a, int b, int c){
        int d=a+b+c;
        return d;
    }
}
