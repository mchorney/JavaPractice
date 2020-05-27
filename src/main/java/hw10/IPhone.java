package hw10;

public class IPhone {
    public String model;
    public int year;
    public String color;
    public int memoryGB;
    public String condition;

    public void iBought(){
        System.out.println("Recently I bought a "+condition+" Iphone "+model+" "+color+" "+memoryGB+"GB, but first it was released in "+year+".");
    }

    public void congrats(){
        if(condition.equals("new")){
            System.out.println("Congratulation on your "+condition+" IPhone! :)");
        }
        else System.out.println("Your new phone is "+condition+", but it is still a good quality.");
    }
}
