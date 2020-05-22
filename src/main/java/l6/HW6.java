package l6;

public class HW6 {
    public static void main(String[] args) {
        System.out.println();
        sum1(5, 5);
        System.out.println();
        int a = sum(3, 2);
        System.out.println(a);
        System.out.println();
        boolean b = isOdd(5);
        System.out.println(b);
    }
    public static void sum1(int a, int b) {
        System.out.println(a + b);
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static boolean isOdd(int x) {
        return x%2 == 0;
    }
}
