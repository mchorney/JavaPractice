package homeWork;

public class Functions {
    public static void main(String[] args) {

        sum(6, 7);

        int c =(sum1(3, 4));
        System.out.println(c);

        isOdd(3);
    }


    public static void sum(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b) + ".");
    }

    public static int sum1(int a, int b) {
        return a + b;
    }

    public static void isOdd(int a) {
        boolean answer;
        answer = a % 2 == 0;
        System.out.println(answer);
    }

}

