package HW10;

public class Table {
    enum material {Wood, Plastic, Steel};
    int desktop;
    int legs;
    int shelves;
    material material;


    void isOrderAccepted(Table a) {
        if (a.desktop < 1 || a.legs < 4) {
            System.out.println("We need at least one desktop and at least four legs.");
        } else System.out.println("We are ready to place you order");
    }
    void yourOrder(Table a) {
        System.out.println("Your order is " + a.material + " table with " + a.legs + " legs " + a.desktop + " desktop and " + a.shelves + " shelves." );
    }
}
