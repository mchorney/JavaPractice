package hw10;

public class Table {
    public enum material {Wood, Plastic, Steel};
    public int desktop;
    public int legs;
    public int shelves;
    public material material;


    public void isOrderAccepted(Table a) {
        if (a.desktop < 1 || a.legs < 4) {
            System.out.println("We need at least one desktop and at least four legs.");
        } else System.out.println("We are ready to place you order");
    }
    public void yourOrder(Table a) {
        System.out.println("Your order is " + a.material + " table with " + a.legs + " legs " + a.desktop + " desktop and " + a.shelves + " shelves." );
    }
}
