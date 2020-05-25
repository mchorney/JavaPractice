package hw7;

import java.util.Arrays;

public class work7 {
    public static void main(String[] args) {
//        1. Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
//                вызовите этот метод из функции main() - подайте в качестве параматра {2,3,5,6,7,8}
//        2. Создайте метод sort - который в качестве аргумента берет int[] и выводит на экран сортированную последовательность по возрастанию.
//                вызовите этот метод внутри функии main()
//        подайте в качестве параматра {3,9,1,8,4,8,5}
//        3. Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
//        (группа мак - макчимальное/ группа win - минимальное)
//        подайте в качестве параматра {3,9,1,8,4,8,5}
        int[]array1={2,3,5,6,7,8};            // for ex1
        int[]array2={3,9,1,8,4,8,5};          // for ex2
        int[]array3={3,9,1,8,4,8,5};          //for  ex3
        System.out.println(sum(array1));
        sort(array2);
        System.out.println(maximum(array3));
        System.out.println(minimum(array3));

    }
    //ex1
    public static int sum (int []nn){
        int summa=0;
        for (int v:nn) {
        summa+=v;
        }
        return summa;
    }
    //ex2
    public static void sort (int[]ss){
      for(int i=ss.length-1;i>0;i--){
          for(int j=0;j<i;j++){
              if (ss[j]>ss[j+1]){
                  int temp = ss[j];
                  ss[j]=ss[j+1];
                  ss[j+1]=temp;
              }
          }
      }
        System.out.println(Arrays.toString(ss));
    }
    //ex3
    public static int maximum (int[]mm){
        int max= mm[0];
        for (int v:mm) {
            if (v>max)
                max=v;
        }
        return max;
    }
    public static int minimum (int[]mini){
        int min=mini[0];
        for (int x:mini) {
            if (x<min)
                min=x;
        }
        return min;
    }
}
