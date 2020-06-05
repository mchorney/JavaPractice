package hw15;

public class Winery implements Store {
    private String[] wineColor;
    private String wineType;
    private String wineBrand;
    private int price;
    private int quantity;
    private int clientAge;

    public void tasteTheWine() {
        System.out.println("The taste is great!");
    }

    public void isAgeAppropriate() {
        if (clientAge < 21) {
            System.out.println("Too young.");
        } else {
            System.out.println("Welcome!");
        }
    }

    @Override
    public void sell() {
    }

    @Override
    public int revenue() {
        int revenue = price * quantity;
        return revenue;
    }
}
