package hw6;

public class Work {
    public static void main(String[] args) {
        sum1(3, 6);

        int a = sum2(2, 5);
        System.out.println(a);

        boolean b = isOdd(8);
        System.out.println(b);
    }
    public static void sum1(int a, int b) {
        System.out.println(a + b);
    }
    public static int sum2(int a, int b) {
        return a + b;
    }
    public static boolean isOdd(int x) {
        return x%2 == 0;
    }
}