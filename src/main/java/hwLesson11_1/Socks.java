package hwLesson11_1;

public class Socks {

    private String brand;
    private int[] size;
    private int price;

    public Socks(){}

    public Socks(String brand, int[] size, int price){
        this.brand = brand;
        this.size = size;
        this.price = price;

    }

    public String getBrand() {
        return brand;
    }

    public int[] getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public  void  printClass(){

        for (double v:this.size) {
            System.out.println("vvvvvvvvvv Socks vvvvvvvvvvvv");
            System.out.println("Socks Brand = " + brand);
            System.out.println("Socks Available Size = " + v);
            System.out.println("Socks price = " + price);

        }
        System.out.println("^^^^^^^^^^^ END of Socks ^^^^^^^^^^^");

    }
}

