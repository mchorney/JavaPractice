package hw12;

public class App {

    public static void main(String[] args) {

        Phone iPhone8 = new Phone("iPhone 8", Brand.APPLE);
        System.out.println(iPhone8.printPhone());

        Color[] iPadColors = {Color.BLACK, Color.WHITE};
        Tablet iPadAir3 = new Tablet("iPad Air 3", iPadColors);
        System.out.println(iPadAir3.printTablet());
    }
}
