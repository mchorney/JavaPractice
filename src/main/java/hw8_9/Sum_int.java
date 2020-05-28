package hw8_9;

public class Sum_int {
    public static void main(String[] args) {
//        1. Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
//вызовите этот метод из функции main() - подайте в качестве параматра {2,3,5,6,7,8}

       int[] arr1 = {2,3,5,6,7,8};
       int[] arr2 = {1,2};
    }

    public static int sum(int[]numbers) {
        int summa=0;
        for(int v : numbers){
            summa=summa+v;
        }
        return summa;



    }
}
