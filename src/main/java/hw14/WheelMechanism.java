package hw14;


public class WheelMechanism extends Mechanism{
    protected int number;

    public WheelMechanism(int number) {
        this.number = number;
    }

    public WheelMechanism(String name, String type, int number) {
        super(name, type);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "WheelMechanism{" +
                "number of wheels = " + number +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void sayHi(){
        System.out.println("WheelMechanism say 'Shhhhhh'");
    }
}
