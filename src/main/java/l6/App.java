package l6;

public class App {

    public static void main(String[] args) {
        double rad = 5;
        double square = circleSquare(rad);
        System.out.println(square);

        System.out.println(circleSquare(7));

        int infant = 1;
        int child = 5;
        int adult = 28;
        int senior = 69;

        System.out.println("passenger 1 = " + ticketPrice(infant));
        System.out.println("passenger 2 = " + ticketPrice(child));
        System.out.println("passenger 3 = " + ticketPrice(adult));
        System.out.println("passenger 4 = " + ticketPrice(senior));
        System.out.println("passenger 5 = " + ticketPrice(150));
        System.out.println("passenger 6 = " + ticketPrice(27));
        int xx = sumOfThreeNumbers(2, 2, 4);
        System.out.println(xx);
        System.out.println(sumOfThreeNumbers(55, 55, 69));

        System.out.println(returnPi());
        double ccc = ticketPrice(55);

        sayHello("Irina");
        sayHello("Misha");
        sayHello("Suren");

    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static double returnPi() {
        return 3.14;
    }

    public static int sumOfThreeNumbers(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }

    public static double circleSquare(double radius) {
        double square = 3.14 * radius * radius;
        return square;
    }

    public static double ticketPrice(int age) {
        int price = 1000;
        if (age <= 2) {
            return 0;
        }
        if (age <= 12) {
            return price * 0.5;
        }
        if (age <= 65) {
            return price;
        }
        return 0.8 * price;
    }
}
