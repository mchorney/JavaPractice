package hw7;

public class work {
    public static void main(String[] args) {
        sum(35,48);
        System.out.println(Sum(7, 89));
        int q=6;
        System.out.println("The statement that "+q+" is an odd number is "+isOdd(q));
    }


    public static int Sum(int a, int b) {
        return a + b;
    }
    public static void sum(int x, int y){
        System.out.println("The sum of "+x+" and "+y+" equals "+(x+y));
    }
    public static boolean isOdd(int z){
        if (z%2==0) return true;
        else return false;
    }
}

