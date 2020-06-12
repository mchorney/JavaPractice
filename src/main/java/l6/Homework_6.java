package l6;

//1. Создайте метод sum - который в качестве аргумента берет 2 целых числа и печатает их результат на экране.
//вызовите этот метод из функции main() (подсказка - тип функции будет void)
//2. Создайте метод sum - который в качестве аргумента берет 2 целых числа и возвращает их сумму.
//вызовите этот метод внутри функии main(), сохраните результат в переменной и выведите результат на экран (подсказка - тип функции будет int)
//3. Создайте метод isOdd - который в качестве аргумента берет целое число и если оно четное возвращает true
//если нечетное - возвращает false
//вызовите этот метод внутри функии main(), сохраните результат в переменной и выведите результат на экран


public class Homework_6 {
    public static void main(String[] args) {
        sum1(1,2);

        int a=3;
        int b=4;
        int s = sum(a,b);
        System.out.println(s);

        int c = 5;
        boolean isEven = isEven(c);
        System.out.println(isEven);

    }

    public static void sum1(int x, int y){
        System.out.println(x+y);
    }

    public static int sum(int a, int b){

        return(a+b);
    }

    public static boolean isEven(int c){
        return (c%2==0);
    }
}
