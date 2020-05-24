package Homework8;

public class METHOD1 {
    public static void main(String[] args) {
        int[]array = {0 ,92, 73, 34};
        int res= summ(array);
        System.out.println(res);
    }

    public static int summ(int[]xx){
        int x=0;
        for (int v:xx){
            x+=v;
        }
        return x;
    }
}
