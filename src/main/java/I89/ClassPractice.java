package I89;

public class ClassPractice {
    public static void main(String[] args) {
        int[] a = {5, 8, 9, 7, 2, 3};
        System.out.println(sumOfTwo(a));
        int[] b = doubleArrayValue(a);
        printArray(b);
        System.out.println();
        int[] ab = sumOfTwoArrays(a, b);
        printArray(ab);
    }
    public static int sumOfTwo(int[] xx) {
        int sum = 0;
        for (int v : xx) {
            sum += v;
        }
        return sum;
    }
    public static int sumOfTwo(int a, int b) {
        return a + b;
    }
    public static double sumOfTwo(double a, double b) {
        return a + b;
    }
    public static String sumOfTwo(String a, String b) {
        return a.concat(b);
    }
    public static int[] doubleArrayValue(int[] xx) {
        int[] aa = new int[xx.length];
        for (int i = 0; i < xx.length; i++) {
            aa[i] = xx[i] * 2;
        }
        return aa;
    }
    public static void printArray(int[] xx) {
        for (int i = 0; i < xx.length; i++) {
            System.out.print(xx[i] + " ");
        }
    }
    public static int[] sumOfTwoArrays(int[] a, int[] b) {
        int[] ab = new int[a.length + b.length];
        for (int i = 0; i < a.length + b.length; i++) {
            if (i < a.length) {
                ab[i] = a[i];
            }
            else ab[i] = b[i - a.length];
        }
        return ab;
    }
}
