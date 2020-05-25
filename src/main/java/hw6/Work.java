package hw6;

public class Work {

    public static void main(String[] args) {
//        exercise1
        summa1(2,9);

//        exercise2
        int num1=2;
        int num2=10;
        int summa=summa2(num1,num2);
        System.out.println(summa);

//        exercise3
//        boolean res=isOdd(13);
        System.out.println(isOdd(12));

    }
    public static void summa1(int n1, int n2){
        int summaDvuh=n1+n2;
        System.out.println(summaDvuh);
    }
    public static int summa2(int num1,int num2){
        return num1+num2;
    }
    public static boolean isOdd (int number){
        boolean result;
        if (number%2==0)
            return result=true;
        else return result = false;
    }
}
