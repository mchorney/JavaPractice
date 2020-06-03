package hwLesson11_1;

public class Shoes {
    private String brand;
    private String[] color;
    private int price;

    public Shoes(){}

    public Shoes(String brand,String[] color,int price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String[] getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public  void  printClass(){

        for (String v:this.color) {
            System.out.println("+++++++++++ Shoes +++++++++++");
            System.out.println("Shoes Brand = " + brand);
            System.out.println("Shoes Available Size = " + v);
            System.out.println("Shoes price = " + price);

        }

        System.out.println("+++++++++++ END of Shoes +++++++++++");
    }
}
