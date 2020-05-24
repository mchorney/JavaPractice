package Homework8;

public class METHOD3 {
    public static void main(String[] args) {
        int[]array={3,9,1,8,4,8,5};
        System.out.println(max(array));
        System.out.println(min(array));
    }

    public static int max(int[]xx){
        int max=xx[0];
        for (int v:xx){
            if (v>max) {
                max=v;
            }
        }
        return max;
    }

    public static int min(int[]xx){
        int min=xx[0];
        for (int v:xx){
            if (v<min) {
                min=v;
            }
        }
        return min;
    }
}
