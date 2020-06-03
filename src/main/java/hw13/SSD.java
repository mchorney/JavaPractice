package hw13;

public class SSD {
    private SSDtype ssDtype;
    private SSDamount ssDamount;
    private Price price;


    public SSD(SSDtype ssDtype, SSDamount ssDamount, Price price) {
        this.ssDtype = ssDtype;
        this.ssDamount = ssDamount;
        this.price = price;
    }

    public SSDtype getSsDtype() {
        return ssDtype;
    }

    public void setSsDtype(SSDtype ssDtype) {
        this.ssDtype = ssDtype;
    }

    public SSDamount getSsDamount() {
        return ssDamount;
    }

    public void setSsDamount(SSDamount ssDamount) {
        this.ssDamount = ssDamount;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String printInfo(){
        return "SSD { SSD = "+ ssDtype +", Amount ="+ ssDamount +", Price ="+price +'}';
    }
}
