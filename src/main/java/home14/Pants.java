package home14;

public class Pants extends Fabric{
    private Size size;
    private int price;

    public Pants() {
    }

    public Pants(Structure structure,Type type,Color color,Size size, int price) {
        super(structure,type,color);
        this.size=size;
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void printMe() {
        System.out.println(" I bought pants is " +structure+" "+ type+" color is "+color+" ,size is "+ size +" and price is $" + price );
    }
}
