package HW8_9;

public class sum_int {
    public static void main(String[] args) {
//        1. Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
//вызовите этот метод из функции main() - подайте в качестве параматра {2,3,5,6,7,8}

        int summa = sum(2, 3, 5, 6, 7, 8);
        System.out.println((summa));
    }

    public static int sum(int a, int b, int c, int d, int e, int f) {

        return (a + b + c + d + e + f);
    }
}
