package hw11;

import org.w3c.dom.ls.LSOutput;

public class Resort {
    private String country;
    private String name;
    private int price;

    public Resort(String country, String name, int price){
        this.country=country;
        this.name=name;
        this.price=price;
    }

    public Resort(){
        this.country="";
        this.name="";
        this.price=0;

    }

    public String getCountry(){
        return country;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void setCountry(String value){
        this.country=value;
    }
    public void setName(String value){
        this.name=value;
    }
    public void setPrice(int value){
        this.price= value;
    }


    public void printClass(){
        System.out.println("Country= "+ country);
        System.out.println("Name= "+ name);
        System.out.println("Price= "+ price);
    }

}
