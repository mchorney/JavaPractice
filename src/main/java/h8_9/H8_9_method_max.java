package h8_9;

public class H8_9_method_max {
    public static void main(String[] args) {
        int[] zz ={3,9,1,8,4,8,5};
        System.out.println(max(zz));
        System.out.println(min(zz));
    }

    public static int max(int[]zz) {
        int max=zz[0];
        for (int v:zz) {
            if (v>max) {
                max=v;
            }
        }
        return max;
    }

    public static int min(int[]zz) {
        int min=zz[0];
        for (int v:zz) {
            if (v<min) {
                min=v;
            }
        }
        return min;
    }
}
