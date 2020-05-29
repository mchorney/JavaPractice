package hw11;

import java.sql.SQLOutput;

public class Cocktails {
    private String name;
    private String spirit;
    private String brandOfSpirit;
    private String[] otherIngredients;
    private String garnish;
    private String howPrepared;
    private String typeOfGlass;
    private int price;

    public Cocktails(){};

    public Cocktails (String n,String s,String bs,String[] oi,String g,String hp,String tg,int p){
        name=n;
        spirit=s;
        brandOfSpirit=bs;
        otherIngredients=oi;
        garnish=g;
        howPrepared=hp;
        typeOfGlass=tg;
        price=p;

    }

    public Cocktails (String name,String spirit,int price){
        this.name=name;
        this.spirit=spirit;
        this.price=price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrandOfSpirit(String brandOfSpirit) {
        this.brandOfSpirit = brandOfSpirit;
    }

    public void setGarnish(String garnish) {
        this.garnish = garnish;
    }

    public void setHowPrepared(String howPrepared) {
        this.howPrepared = howPrepared;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOtherIngredients(String[] otherIngredients) {
        this.otherIngredients = otherIngredients;
    }

    public void setSpirit(String spirit) {
        this.spirit = spirit;
    }

    public void setTypeOfGlass(String typeOfGlass) {
        this.typeOfGlass = typeOfGlass;
    }

    public int getPrice() {
        return price;
    }

    public String getBrandOfSpirit() {
        return brandOfSpirit;
    }

    public String getGarnish() {
        return garnish;
    }

    public String getHowPrepared() {
        return howPrepared;
    }

    public String getName() {
        return name;
    }

    public String getSpirit() {
        return spirit;
    }

    public String getTypeOfGlass() {
        return typeOfGlass;
    }

    public String[] getOtherIngredients() {
        return otherIngredients;
    }



    public void printMe(){
        System.out.println("Cocktail name: "+name+"\nSpirit: "+spirit+"\nBrand of Spirit used: "+brandOfSpirit+
                "\nGarnish: "+garnish+"\nHow prepared: "+howPrepared+ "\nGlass to serve: "+typeOfGlass+"\nPrice = $"+price);
        System.out.println("Other Ingredients that go in "+name+":");
        for(String v:otherIngredients){
            System.out.print(v+" ");
        }
        System.out.println("\n");
    }
}
