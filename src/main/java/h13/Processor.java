package h13;

public class Processor {
    private String brand;
    private String series;
    private int price;

    public Processor(String brand, String series, int price) {
        this.brand = brand;
        this.series = series;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Processor: brand =" + brand + ", series =" + series + ", price =" + price);
    }
}
