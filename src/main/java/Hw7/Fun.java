package Hw7;

public class Fun {
    public static void main(String[] args) {
        sum1(5, 6);
        int w= sum2(6,5);
        System.out.println(w);
        boolean od= isOdd(w);
        System.out.println(od);

    }

    public static void sum1(int a, int b) {
        System.out.println(a + b);
    }

    public static int sum2(int a, int b) {
        int f = a + b;
        return f;
            }

    public static boolean isOdd(int number) {
//        if (number % 2 != 0) {
//            return true;
//        } else {
//            return false;
//        }
        boolean r=(number % 2 != 0);
        return  !r;

    }
}
