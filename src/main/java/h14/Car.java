package h14;

public class Car extends WheelDrive {
    protected String modelEngine;

    public Car(int numberOfwheels, String modelEngine) {
        super(numberOfwheels);
        this.modelEngine = modelEngine;
    }

    public Car(String typeDrive, int numberOfwheels, String modelEngine) {
        super(typeDrive, numberOfwheels);
        this.modelEngine = modelEngine;
    }

    public Car(String name, String type, String typeDrive, int numberOfwheels, String modelEngine) {
        super(name, type, typeDrive, numberOfwheels);
        this.modelEngine = modelEngine;
    }

    public String getModelEngine() {
        return modelEngine;
    }

    public void setModelEngine(String modelEngine) {
        this.modelEngine = modelEngine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelEngine='" + modelEngine + '\'' +
                ", numberOfwheels=" + numberOfwheels +
                ", typeDrive='" + typeDrive + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void sayHi() {
        System.out.println("Car say 'LETS GO, BOSS'");
    }

}
