package HW7;

public class work {
    public static void main(String[] args) {
        sumOfTwoNumbers(78 + 13);

        System.out.println(sumOfTwoNumbers(1, 7));

        int odd =3;
        int even =4;
        System.out.println(isOdd(9));

    }

    public static void sumOfTwoNumbers(Integer numbers) {
        System.out.println("Sum = " + numbers);

    }
    public static int sumOfTwoNumbers(int a, int b) {
        int d = a + b;
        return d;

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

