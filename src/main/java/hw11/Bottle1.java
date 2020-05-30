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
    public  void e1(String name){this.name= name;}
    public  void e2(String brand){this.brand= brand;}
    public  void e3(String sugar_concentration){this.sugar_concentration= sugar_concentration;}
    public  void e4(String taste){this.taste= taste;}

    public String r1(){return name;}
    public String r2(){return brand;}
    public String r3(){return sugar_concentration;}
    public String r4(){return taste;}
    public void printClass2(){
        System.out.println("name "+name+"\nbrand"+brand+"\nsugar concantrat "+sugar_concentration+"\ntaste "+taste);
    }


}
