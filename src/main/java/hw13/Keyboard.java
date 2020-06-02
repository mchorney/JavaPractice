package hw13;

public class Keyboard {
    private String  brand;
    private String  model;
    private String connectionsType;

    public Keyboard(String brand, String model, String connectionsType) {
        this.brand = brand;
        this.model = model;
        this.connectionsType = connectionsType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getConnectionsType() {
        return connectionsType;
    }

    public void setConnectionsType(String connectionsType) {
        this.connectionsType = connectionsType;
    }

    public void printOut() {
        System.out.println("Keyboard " +brand+ ", model " +model+ ", " +connectionsType+ " connection, ");
    }
}
