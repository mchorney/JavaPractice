package homework89;

public class Hw89 {


//    1.Создайте метод sum-который в качестве аргумента берет int[]и возвращает его сумму.
//        вызовите этот метод из функции main()-подайте в качестве параматра{2,3,5,6,7,8}
//        2.Создайте метод sort-который в качестве аргумента берет int[]и выводит на экран сортированную
//        последовательность по возрастанию.
//        вызовите этот метод внутри функии main()
//        подайте в качестве параматра{3,9,1,8,4,8,5}
//        3.Создайте метод,который в качестве аргумента берет int[]и возвращает максимальное/минимальное значение
//        (группа мак-макчимальное/группа win-минимальное)
//        подайте в качестве параматра{3,9,1,8,4,8,5}

        public static void main(String[] args) {

            int[] s = new int[]{3, 9, 1, 8, 4, 8, 5};
            int max = getMax(s);
            System.out.println("Maximum number is:" + max);

            int[] kk = new int[]{3, 9, 1, 8, 4, 8, 5};
            int min = getMin(kk);
            System.out.println("Minimum number is:" + min);


            int gg = sum(2, 3, 5, 6, 7, 8);
            System.out.println((gg));


            int[] z = {2, 3, 5, 6, 7, 8};
            for (int num : z) {
                System.out.println(num + ", ");
            }
            int count = 0;
            do {
                for (int i = 0; i < z.length - 1; i++) {
                    if (z[i] > z[i + 1]) {
                        int sort = z[i];
                        z[i] = z[i + 1];
                        z[i + 1] = sort;
                        count++;


                    }
                }

            } while (count > 0);
            System.out.println();
            for (int num : z) {
                System.out.println(num + ",");
            }
        }

        public static int sum(int a, int b, int c, int d, int e, int f) {

            return (a + b + c + d + e + f);
        }

        public static int getMax(int[] s) {
            int maxNumber = s[0];
            for (int h = 1; h < s.length; h++) {
                if (s[h] > maxNumber) {
                    maxNumber = s[h];
                }
            }
            return maxNumber;
        }

        public static int getMin(int[] kk) {
            int minNumber = kk[0];
            for (int h = 1; h < kk.length; h++) {
                if (kk[h] < minNumber) {
                    minNumber = kk[h];
                }
            }
            return minNumber;
        }
    }



