
package hw89;


public class Chernovik {
    public static void main(String[] args) {

//        int [] array = {2,3,5,6,7,8};
//        System.out.println(sum (array));

        int[] unsorted = {3, 9, 1, 8, 4, 8, 5};


//        Arrays.sort(unsorted);
//        System.out.println(Arrays.toString(unsorted));
//
//        sort(unsorted);
//        printarrey(unsorted);
//
//        }

        System.out.println(max_from_array(unsorted));


    }

//    public static int sum(int[] a) {
//        int start = 0;
//        for (int v : a) {
//            start = start + v;
//
//        }
//        return start;
//
//    }
//
//    public static void sort (int[]arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] < arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }}
//        public static void printarrey (int[] arr){
//            for (int v:arr) {
//                System.out.println(v);
//            }
//

//    }

    public static int max_from_array(int[] xx) {
        int max = xx[0];
        for (int v : xx) {
            if (v > max) {
                max = v;
            }

        }
        return max;
    }
}






