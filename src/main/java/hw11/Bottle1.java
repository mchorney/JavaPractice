package hw11;

import org.w3c.dom.ls.LSOutput;

public class Bottle1 {
    private String name;
    private String brand;
    private String sugar_concentration;
    private String taste;


    public Bottle1(){}
    public Bottle1(String a, String b, String c, String d){
        name = a;
        brand = b;
        sugar_concentration= c;
        taste = d;
    }
    public Bottle1(String name, String brand, String taste){
        this.taste= taste;
        this.brand= brand;
        this.name= name;
    }
    public  void setName(String name){this.name= name;}
    public  void setBrand(String brand){this.brand= brand;}
    public  void setSugar_concentration(String sugar_concentration){this.sugar_concentration= sugar_concentration;}
    public  void setTaste(String taste){this.taste= taste;}

    public String getName(String name){return name;}
    public String getBrand(String brand){return brand;}
    public String getSugar_concentration(String sugar_concentration){return sugar_concentration;}
    public String getTaste(String taste){return taste;}
    public void printClass2(){
        System.out.println("name "+name+"\nbrand"+brand+"\nsugar concantrat "+sugar_concentration+"\ntaste "+taste);
    }


}
