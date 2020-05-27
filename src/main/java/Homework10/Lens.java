package Homework10;

public class Lens {
    public String model;
    public String zoom;
    public String diaphragm;
    public int price;

    public void printMe(){
        System.out.println("model=" +model);
        System.out.println("zoom=" +zoom);
        System.out.println("diaphragm=" +diaphragm);
        System.out.println("price=" +price);
        System.out.println(model +" "+ zoom + " " + diaphragm + " " + "price=" +price);
    }
}
