package home14;

public class Suit extends Fabric{
    private Pants pants;
    private Jacket jacket;
    private int price;

    public Suit() {
    }

    public Suit(Structure structure, Type type, Color color, Jacket jacket,Pants pants,int price) {
        super(structure, type, color);
        this.jacket = jacket;
        this.pants=pants;
        this.price=price;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void printMe() {
        System.out.println( "Suit "+structure+" "+type+" "+ "color "+color+ "price is "+price +" ,this suit consists");
        jacket.printMe();
        pants.printMe();

    }
}
