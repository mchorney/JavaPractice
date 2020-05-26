package hw89;

public class homework89 {

        public static void main(String[] args) {

            int[] array1 = {2, 3, 5, 6, 7, 8};
            int[] array2 = {3, 9, 1, 8, 4, 8, 5};




            System.out.println(sum(array1));
            System.out.println(getMax(array2));
            System.out.println(getMin(array2));
            sort(array2);
        }

        public static void sort(int[] xx){
            int temp;
            for (int i = 0; i < xx.length; i++)
            {
                for (int j = i + 1; j < xx.length; j++) {
                    if (xx[i] > xx[j])
                    {
                        temp = xx[i];
                        xx[i] = xx[j];
                        xx[j] = temp;
                    }
                }
            }
            for (int i = 0; i < xx.length; i++)
            {
                System.out.print(xx[i] + " ");
            }

        }
        public static int sum(int[] xx) {
            int sum = 0;
            for (int v : xx) {
                sum += v;
            }
            return sum;
        }

        public static int getMax(int[] xx) {
            int maxValue = xx[0];
            for (int i = 1; i < xx.length; i++) {
                if (xx[i] > maxValue) {
                    maxValue = xx[i];
                }
            }
            return maxValue;
        }

        public static int getMin(int[] xx) {
            int minValue = xx[0];
            for (int i = 1; i < xx.length; i++) {
                if (xx[i] < minValue) {
                    minValue = xx[i];
                }
            }
            return minValue;


        }
    }
