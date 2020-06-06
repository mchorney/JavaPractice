package hw15;

import hw12_Enums.TypesOfCoffee;

public class Coffee implements Beverage{
    private TypesOfCoffee typesOfCoffee;
    private int temperature;
    private boolean alco;
    private TypesOfMilk typesOfMilk;

    public Coffee(TypesOfCoffee typesOfCoffee, int temperature, boolean alco, TypesOfMilk typesOfMilk) {
        this.typesOfCoffee = typesOfCoffee;
        this.temperature = temperature;
        this.alco = alco;
        this.typesOfMilk = typesOfMilk;
    }

    public TypesOfCoffee getTypesOfCoffee() {
        return typesOfCoffee;
    }

    public void setTypesOfCoffee(TypesOfCoffee typesOfCoffee) {
        this.typesOfCoffee = typesOfCoffee;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void tempOfBev() {
        String t ="";
       if(temperature>=160){
           t="hot";
       }
       else{
           t="cold";
       }
        System.out.println(typesOfCoffee+" is a "+t+" drink!");
    }

    @Override
    public boolean ice() {
        if (temperature<160){
        return true;}
        else return false;
    }

    @Override
    public void alcoAndAge() {
        if(alco){
            System.out.println("You have to be over 21 to have this, may I see your ID?");
        }
        else{
            System.out.println("This beverage does not contain any alcohol.");
        }
    }

    @Override
    public boolean lactose() {
        if(typesOfMilk==TypesOfMilk.REGULAR||typesOfMilk==TypesOfMilk.SKIM){
        return true;}
        else return false;
    }


    @Override
    public void printInfo() {
        System.out.println("Coffee{" +
                "What kind =" + typesOfCoffee +
                "; What is the temperature =" + temperature +
                "; Contains alcohol =" + alco +
                "; Kind of milk =" + typesOfMilk +
                "; Lactose = "+lactose()+
                '}');
    }
}
