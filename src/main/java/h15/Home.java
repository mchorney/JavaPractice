package h15;

public class Home extends Tables implements ComputerTable, KitchenTable, KitchenChair, ComputerChair {
    private int numberOfTables;
    private int usageTimes;

    public Home(String brand, String model, int price, int numberOfTables, int usageTimes) {
        super(brand, model, price);
        this.numberOfTables = numberOfTables;
        this.usageTimes = usageTimes;
    }

    public void comfortWork() {
        System.out.println("ComfortWork computer table interface implemented for Home");
    }

    @Override
    public void comfortableEat() {
        System.out.println("ComfortEat kitchen table interface implemented for Home");
    }

    public void comfortWorking() {
        System.out.println("ComfortWork computer chair interface implemented for Home");
    }

    public void comfortableSeat(){
        System.out.println("ComfortSeat kitchen chair interface implemented for Home");
    }
}
