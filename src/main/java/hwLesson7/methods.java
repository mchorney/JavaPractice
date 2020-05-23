package hwLesson7;

public class methods {
        public static void main(String[] args){

            boolean result;
            int sum2_result;
            sum(2,5);
            System.out.println(sum2_result=sum2(3,7));

            System.out.println(result=isEven(7));

        }
        public static void sum(int a, int b){
            int ab=a+b;
            System.out.println("A+B =" + ab );
        }
        public static int sum2(int a,int b){
            return a+b;
        }
        public static boolean isEven(int a){
            if (a%2==0){
                return true;
            } else return false;
        }

}
