package hw10;

public class Food {
    public String name;
    public String type;
    public double amountInGrams;
    public double ccalPer100gramm;

    public void countCcal(){
        double ccal=(ccalPer100gramm/100)*amountInGrams;
        System.out.println("The amount of calories for "+name+" for "+amountInGrams+" gramms is "+ccal+".");
    }
    public void typePrint(){
        System.out.println(name+" is a "+type+".");
    }

}

