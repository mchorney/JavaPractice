package l11;


import java.util.Arrays;

public class Numbers {
    private int[] numbers;
    private double[] decimal;
    private int favoriteNumber;

    public Numbers() {
        System.out.println("Default constructor created");
    }

    public Numbers(int[] numbers) {
        setNumbers(numbers);
        System.out.println("Thank you for adding array of int's");
    }

    public Numbers(double[] decimal) {
        setDecimal(decimal);
        System.out.println("Thank you for adding array of doubles's");
    }

    public Numbers(int[] numbers, double[] decimal, int favoriteNumber) {
        setNumbers(numbers);
        setDecimal(decimal);
        setFavoriteNumber(favoriteNumber);
        System.out.println("Thank you for adding ALL numbers");
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
    public int[] getNumbers() {
        return numbers;
    }

    public void setDecimal(double[] decimal) {
        this.decimal = decimal;
    }
    public double[] getDecimal() {
        return decimal;
    }

    public void setFavoriteNumber(int favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
    }
    public int getFavoriteNumber() {
        return favoriteNumber;
    }

    public void printClass() {
        if(getNumbers() != null) System.out.println("Array of int's "+ Arrays.toString(getNumbers()));
        if(getDecimal() != null) System.out.println("Array of double's " + Arrays.toString(getDecimal()));
        if(getFavoriteNumber() != 0) System.out.println("Your favorite number is " + getFavoriteNumber());
        System.out.println();
    }
}
