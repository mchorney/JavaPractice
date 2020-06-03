package hw14;

public class Car extends WheelMechanism{
    private String engineType;

    public Car(int number, String engineType) {
        super(number);
        this.engineType = engineType;
    }

    public Car(String name, String type, int number, String engineType) {
        super(name, type, number);
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineType='" + engineType + '\'' +
                ", number of wheels = " + number +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    @Override
    public void sayHi(){
        System.out.println("Car say 'Vzzzzz'");
    }
}
