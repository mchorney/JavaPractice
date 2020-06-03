package home14;

public class App {
    public static void main(String[] args) {
        Pants capri = new Pants(Structure.COTTON, Type.VELVET, Color.BLACK, Size.L, 30);
        capri.printMe();
        Jacket jacket = new Jacket(Type1.CLASSIC, Structure.WOOL, Type.VELVETEEN, Color.GREY, Size.M);
        jacket.printMe();
        Suit suit = new Suit(Structure.COTTON, Type.VELVETEEN, Color.GREEN, jacket, capri, 100);
        suit.printMe();
    }}