package homework14;

public class Box {
    protected double lenth;
    protected double width;
    protected double depth;

    public Box() {
    }
//

    public Box(double lenth, double width, double depth) {
        this.lenth = lenth;
        this.width = width;
        this.depth = depth;
    }

    public double getLenth() {
        return lenth;
    }

    public void setLenth(double lenth) {
        this.lenth = lenth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }


    public void pack() {
        System.out.println("Box{" +
                "lenth=" + lenth +
                ", width=" + width +
                ", depth=" + depth +
                '}');
    }
}
