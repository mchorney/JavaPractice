package hwLesson8;
import java.util.Arrays;

//import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class App {
    public static void main(String[]args){
        int[] arr_num1 = {2,3,5,6,7,8};
        int[] arr_num2 = {3,9,1,8,4,8,5,21};
        System.out.println("Sum of the integers for exercise #1:\n" +sum(arr_num1));
        arr_num2[7]=25;
        System.out.println("Sum of the integers for exercise #5:\n" +sum(arr_num2));
        my_sort(arr_num2);
        int x=sum2(1,2,3);
        System.out.println(x);
        //boolean y = method(1,2,3);
        //System.out.println(y);
        boolean z= method2(1,2,3);
        System.out.println(z);
        double y = method3(1,2);
        System.out.println(y);
    }
        public static int sum(int[] arr_num){

        int result=0;
            for (int v:arr_num){
                result+=v;
            }
            return result;
    }
    public static int sum2(int a, int b, int c){
        int result;
        return result = a + b + c ;

    }
    public static boolean method2(int a, double b,int c) { return a==(b+c);}
    public static double method3(int a, double b) {return a*b; }


    //public static boolean method(int a, double b,int c) {return a>b; }
    public void method(int a, double b, int c) { }

        public static void my_sort(int[] arr_num){
            //FIRST -  sort the by using existing functions
            //----------------------------------------------

           // Arrays.sort(arr_num);
           // System.out.println("Sorted Array for exercise #2:\n"+ Arrays.toString( arr_num));
            //SECOND - my own sort
            //----------------------------------------------

            int a;
            for (int i=1;i< arr_num.length-1;i++){
                a=arr_num[i-1];
                System.out.println("arr[i] is:"+arr_num[i]);
                System.out.println("a:"+a);
                if (a>arr_num[i]){
                    //System.out.println("a:"+a);
                    //System.out.println("arr_num[i]"+ arr_num[i]);
                    int temp = a;
                    a=arr_num[i];
                    arr_num[i]=temp;
                    /* swap(a,arr[i]); */
                }
                else {
                    continue;
                }
                System.out.println(Arrays.toString(arr_num));
            }

            System.out.println(Arrays.toString(arr_num));

        }
}
