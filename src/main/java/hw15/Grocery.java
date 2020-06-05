package hw15;

public class Grocery implements Store {
    private String[] fish;
    private String[] vegetables;
    private String[] fruits;
    private int price;
    private int quantity;

    public void cookFood() {
        System.out.println("The food is cooked");
    }

    public void measureWeightOfTheProduct() {
        System.out.println("Weight of the product");
    }

    @Override
    public void sell() {
        System.out.println("Selling Groceries");
    }

    @Override
    public int revenue() {
        int revenue = price * quantity;
        return revenue;
    }
}
