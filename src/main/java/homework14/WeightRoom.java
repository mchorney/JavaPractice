package homework14;

public class WeightRoom extends Box{
    protected double weigth;

//    public WeightRoom(){}

    public WeightRoom(double lenth, double width, double depth, double weigth) {
        super(lenth, width, depth);
        this.weigth = weigth;
    }

    public void pack() {
        System.out.println("WeightRoom{" +
                "weigth=" + weigth +
                ", lenth=" + lenth +
                ", width=" + width +
                ", depth=" + depth +
                '}');
    }
}
