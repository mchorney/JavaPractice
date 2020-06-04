package homework14;

public class Truck extends Car {
    private String usedFor;
    private String capacity;

    public Truck(String make, String model, Color color, String usedFor, String capacity) {
        super(make, model, color);
        this.usedFor = usedFor;
        this.capacity = capacity;
    }

    public String getUsedFor() {
        return usedFor;
    }

    public String getCapacity() {
        return capacity;
    }

    @Override
    public void printme() {
        super.printme();
        System.out.print(", capacity - "+capacity+", great for "+usedFor);

}
}
