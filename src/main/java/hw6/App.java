package hw6;

public class App {
    public static void main(String[] args) {
        sum(58,-36);
        int gg=sum2(85,17);
        System.out.println(gg);

        System.out.println(isEven(18));

    }
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static int sum2(int a, int b){
        return a+b;
    }

    public static boolean isEven(int a){
        return a % 2 == 0;
    }
}
