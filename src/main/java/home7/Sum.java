package home7;

public class Sum {
    public static void main(String[] args) {
        sum1(7,19);
        sum1(54,63);

        var xx=sum(67,54);
        System.out.println(xx);
        System.out.println(sum(73,52));


        boolean y=isOdd(4);
        System.out.println(y);

        boolean b=isOdd(87);
        System.out.println(b);

    }

    public static void sum1(int a, int b) {
        System.out.println(a + b);
    }

    public static int sum(int a, int b){
        int c=a+b;
        return c;
    }
    public static boolean isOdd(int x){
        return x%2==0;
    }



}
