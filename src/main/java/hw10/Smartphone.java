package hw10;

public class Smartphone {
    public String brand;
    public String model;
    public String OS;
    public double size;
    public String color;


    public void printIt() {
        System.out.println("brand = " + brand);
        System.out.println("model = " + model);
        System.out.println("OS = " + OS);
        System.out.println("size = " + size);
        System.out.println("color = " + color);



    }
    public void usage(){
        System.out.println("Last time updated my OS to "+OS + "," +" on my lovely "+brand);
    }
}
