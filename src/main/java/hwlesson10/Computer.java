package hwlesson10;

public class Computer {
    public String memory;
    public String hd;
    public String brand;
    public String price;

    public void printMe(){
        System.out.println("--------------------");
        System.out.println("Brand = " + brand);
        System.out.println("HD = "+ hd);
        System.out.println("Price = "+ price);
        System.out.println("Memory = " + memory);
        System.out.println("--------------------");
    }

}
