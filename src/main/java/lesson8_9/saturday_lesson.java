package lesson8_9;

public class saturday_lesson {
    public static void main(String[] args) {
//        var xx = sum_of_5_nums(5,55,14,-69,87);
//        System.out.println(xx);
//
//        String newword=sum_of_2_str("One","Two");
//        System.out.println(newword);
//        System.out.println(sum_of_2_str("Three","Four"));

        int[] ar1 = {1, 3, 7, 7};
        int[] ar2 = {2, 3};
        int[] ar3 = {9, 8, 7, 4, 4, 5, 4, 6};
//        System.out.println(sum_of_array(ar1));
//        System.out.println(sum_of_array(ar2));
//        System.out.println(sum_of_array(ar3));
//        for (int v : ar_2(ar3)) {
//            System.out.println(v);
//        }
        System.out.println(sum_of_2(1,6));
        System.out.println(sum_of_2("Olha ","the Best"));
        System.out.println(sum_of_2(1.2,6.9));
    }
        public static int sum_of_2(int str1, int str2){
            return str1 + str2;
        }
        public static String sum_of_2 (String str1, String str2){
            return str1 + str2;
        }
        public static double sum_of_2(double str1,double str2){
           return str1+str2;
         }

    public static int sum_of_5_nums(int a1,int a2, int a3,int a4, int a5){
        return a1+a2+a3+a4+a5;
    }
    public static String sum_of_2_str(String str1,String str2){
        return str1+str2;
    }
    public static int sum_of_array(int[]xx){
        int sum=0;
        for(int v:xx){
            sum+=v;
        }
        return sum;
    }
    public static int[] ar_2(int[]arr){
        int[]new_array=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            new_array[i]=arr[i]*2;
        }
        return new_array;
    }


}
