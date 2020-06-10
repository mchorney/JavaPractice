package h7;

public class Method3 {
    public static void main(String[] args) {
        boolean u=isOdd(6);
        System.out.println(u);

        boolean w=isOdd(95);
        System.out.println(w);
    }

    public static boolean isOdd(int y) {
        return y % 2 == 0;
    }
}
