package additionalwork;

public class Remainder {
    public static void main(String[] args) {

        System.out.println(rest (7,3));
        System.out.println(rest (20,5));
        System.out.println(rest (100,3));
    }
    public static int rest(int a, int b) {
        int rest = a - b;
        while (rest >= b) {
            rest = rest - b;

        }
        return rest;
    }
}
