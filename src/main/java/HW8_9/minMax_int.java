package HW8_9;

public class minMax_int {
    public static void main(String[] args) {
        int[] p = new int[]{3, 9, 1, 8, 4, 8, 5};
        int max = Max(p);
        System.out.println("Max number is " + max);
    }
//        3. Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
//(группа мак - макчимальное/ группа min - минимальное)
//подайте в качестве параматра {3,9,1,8,4,8,5}

    public static int Max(int[] p) {
        int maxNumber = p[0];
        for (int h = 1; h < p.length; h++) {
            if (p[h] > maxNumber) {
                maxNumber = p[h];
            }
        }
        return maxNumber;
    }

}
