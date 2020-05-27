package additionalwork;

public class Remainder {
    public static void main(String[] args) {

        System.out.println(rest (7,3));
        System.out.println(rest (10,5));
        System.out.println(rest (44,13));
    }
    public static int rest(int a, int b) {
        int rest = a - b;
        if (rest >= b) {
            rest = rest - b;
        } else {

        }
        return rest;
    }
}
