package hw10;

public class GroceryBasket {
    public int amount;
    public String productName;
    public double price;
    public boolean isPayed;

    public double priceCalculator(GroceryBasket b) {
        return b.amount * b.price;
    }
    public void checkOut(GroceryBasket a) {
        if(a.isPayed) {
            System.out.println("You bought " + amount + " " + productName + " for " + a.priceCalculator(a));
        }else System.out.println("Your total price for " + amount + " " + productName + " is " + a.priceCalculator(a) + ". Please proceed to the cashier.");
    }
}
