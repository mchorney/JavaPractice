package hw10;

import java.sql.SQLOutput;

public class Bootcamp {
    public String name;
    public String duration;
    public String trainer;
    public int price;

    public void printMe(){
        System.out.println("name = " +name);
        System.out.println("duration = " +duration);
        System.out.println("trainer = " +trainer);
        System.out.println("price = " +price);

    }

    public void postponed(){
        System.out.println(name + " Bootcamp will be postponed for 1 month. " + price + " price will stay same ");


    }

    public void changedate(){
        System.out.println(name = " Bootcamp is reschedualed. " + trainer + " will be substituted by trainer Robert."  );

    }








}
