package HW10;

public class GroceryBasket {
    int amount;
    String productName;
    double price;
    boolean isPayed;

    double priceCalculator(GroceryBasket b) {
        return b.amount * b.price;
    }
    void checkOut(GroceryBasket a) {
        if(a.isPayed) {
            System.out.println("You bought " + amount + " " + productName + " for " + a.priceCalculator(a));
        }else System.out.println("Your total price for " + amount + " " + productName + " is " + a.priceCalculator(a) + ". Please proceed to the cashier.");
    }
}
