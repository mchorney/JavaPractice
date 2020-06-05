package hw15;

public class App {
    public static void main(String[] args){

        PickUpTruck ford = new PickUpTruck("Ford","F150",30000 );

        ford.transmissionType();
        ford.fuelType();
        ford.wheelsBase();

        PickUpTruck dodge = new PickUpTruck("Dodge","RAM1500",32000);

        dodge.transmissionType();
        dodge.fuelType();
        dodge.wheelsBase();


        Sedan chevy = new Sedan("Chevy","Malibu",22000);

        chevy.fuelType();
        chevy.transmissionType();
        chevy.wheelsBase();

        Sedan honda = new Sedan("Honda","Civic",20000);

        honda.wheelsBase();
        honda.transmissionType();
        honda.fuelType();


    }
}
