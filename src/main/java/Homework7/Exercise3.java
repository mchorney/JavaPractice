package Homework7;

public class Exercise3 {
    public static void main(String[] args) {
        boolean check= is0dd(13);
        System.out.println(check);
    }

    public static boolean is0dd(int a){
        return a % 2 == 0;
    }
}
