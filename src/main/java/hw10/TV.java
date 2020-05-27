package hw10;

public class TV {
    public String brand;
    public int sizeInches;
    public String SmartOrNot;
    public int motionRate;
    public double price;

    public void BlackFriday(){
        double discount=price/2;
        if(SmartOrNot.startsWith("No")){
            SmartOrNot=SmartOrNot.concat(" though");
        }
        System.out.println("On a Black Friday we bought a new "+brand+" TV "+sizeInches+"' "+SmartOrNot+", with motion rate "+motionRate+
                ", with a 50% discount for only $"+discount+", when the original price was "+price+".");
    }
    public void sale(int percentDisc){
        double newPrice=price-((price/100)*percentDisc);
        System.out.println("This "+brand+" TV is on sale now with a "+percentDisc+"% discount for "+newPrice+", and the original price was $"+price+".");
    }



}
