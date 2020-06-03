package home14;

public class Jacket extends Fabric {
    private Type1 type1;
    private Size size;

    public Jacket(Type1 type1,Structure structure,Type type,Color color,Size size) {
        super(structure, type, color);
        this.size = size;
        this.type1=type1;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Type1 getType1() {
        return type1;
    }

    public void setType1(Type1 type1) {
        this.type1 = type1;
    }

    @Override
    public void printMe() {
        System.out.println( "I bought "+type1+" jacket is "+structure+" "+ type+" color is "+color+" size "+size);
    }
}
