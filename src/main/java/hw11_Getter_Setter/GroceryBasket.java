package hw11_Getter_Setter;

public class GroceryBasket {
    private int amount;
    private String[] productsName;
    private double price;
    private boolean isPayed;

    public GroceryBasket() {}
    public GroceryBasket(int amount, String[] productsName, double price) {
        this.amount = amount;
        this.productsName = productsName;
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

    public void setProductsName(String[] productsName) {
        this.productsName = productsName;
    }
    public String[] getProductsName() {
        return productsName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setPayed(boolean isPayed) {
        this.isPayed = isPayed;
    }
    public boolean getPayed() {
        return isPayed;
    }



    public void printClass(GroceryBasket gb) {
        if(gb.isPayed) {
            System.out.println("You bought " + gb.getAmount() + " " + gb.printArrays(gb) + " for " + gb.priceCalculator(gb));
        }else System.out.println("Your total price for " + gb.getAmount() + " " + gb.printArrays(gb) + " is " + gb.priceCalculator(gb) + ". Please proceed to the cashier.");
    }
    public String printArrays(GroceryBasket gb) {
        String s = new String();
        for (String pn : gb.getProductsName()) {
            s += pn + " ";
        }
        return s;
    }
    public double priceCalculator(GroceryBasket gb) {
        return gb.getAmount() * gb.getPrice();
    }

}
