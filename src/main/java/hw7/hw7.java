package hw7;

public class hw7 {
    public static void main(String[]args){
        int x = 2;
        int y = 3;
        System.out.println(x+" "+y);
        int xx = sumOfTwoNumbers(x,y);
        System.out.println(xx);
        boolean z = isOdd(5);
        System.out.println(z);
    }



    public static int sumOfTwoNumbers(int a, int b){
        int d=a+b;
        return d;
    }
    public static boolean isOdd(int x){
        if(x%2==0){
            return true;
        }
        return false;
    }


}
