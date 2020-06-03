package home14;

public class Fabric {
    protected Structure structure;
    protected Type type;
    protected Color color;

    public Fabric() {
    }

    public Fabric(Structure structure,Type type,Color color) {
        this.structure = structure;
        this.type=type;
        this.color=color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Structure getStructure() {
        return structure;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    public void printMe() {
        System.out.println( "Fabric; structure is " + structure + ", type is " + type +", color is " + color);
    }
}
