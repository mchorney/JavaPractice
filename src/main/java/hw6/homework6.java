package hw6;

public class homework6 {

    public static void main(String[] args) {
        sum1(23,27);
        int a = 5;
        int b = 6;
        System.out.println(a+b);

        System.out.println(sum(7,7));


        System.out.println(isOdd(9));

    }
    public static void sum1(int x, int y){
        System.out.println(x=y);
    }


    public static int sum(int a, int b){
        int c=a+b;
        return c;
    }

    public static boolean isOdd(int d){
        return d % 2 != 0;
    }
}


