package hw7;

public class Functions {
    public static void main(String[] args) {

//        sumoftwo(3, 5);
//
//        System.out.println(totaloftwonumbers(2,78));


//        int odd =1;
//        int even =2;
        System.out.println(isOdd(5));


    }

  public static void sumoftwo(int a, int b) {
      System.out.println(a + b);
  }


  public static int totaloftwonumbers(int d, int e) {
      int k = d + e;
      return k;
  }

    public static boolean isOdd(int number) {
        boolean f = true || false;
        if (number % 2 == 0) {
            f = false;
        }
        if (number % 2!= 0) {
            f = true;
        }

        return f;
    }}









