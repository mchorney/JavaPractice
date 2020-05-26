package HW7;

public class sum_boolean {
    public static void main(String[] args) {
//3. Создайте метод isOdd - который в качестве аргумента берет целое число и если оно четное возвращает true
//        если нечетное - возвращает false
//        вызовите этот метод внутри функии main(), сохраните результат в переменной и выведите результат на экран
        int odd =3;
        int even =4;
        System.out.println(isOdd(9));

    }
    public static boolean isOdd(int number) {
        boolean f = true || false;
        if (number % 2 == 0) {
            f = false;
        }
        if (number % 2!= 0) {
            f = true;
        }
        return f;
    }
}
