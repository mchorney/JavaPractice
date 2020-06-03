package homework14;

public final class Packadge extends WeightRoom{
    private String Name;
    private Address address;

//
    public Packadge(double lenth, double width, double depth, double weigth, String name, Address address) {
        super(lenth, width, depth, weigth);
        Name = name;
        this.address = address;
    }


    @Override
    public void pack() {
        System.out.println("Packadge{" +
                "Name='" + Name + '\'' +
                ", address=" + address +
                ", weigth=" + weigth +
                ", lenth=" + lenth +
                ", width=" + width +
                ", depth=" + depth +
                '}');
    }
}

