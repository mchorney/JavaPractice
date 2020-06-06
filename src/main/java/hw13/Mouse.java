package hw13;

public class Mouse {
    private MouseBrand  brand;
    private String  model;
    private String connectionsType;

    public Mouse(MouseBrand brand, String model, String connectionsType) {
        this.brand = brand;
        this.model = model;
        this.connectionsType = connectionsType;
    }

    public MouseBrand getBrand() {
        return brand;
    }

    public void setBrand(MouseBrand brand) {
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
        System.out.println ("Mouse " +brand+ ", model " +model+ ", " +connectionsType+ " connection, ");
    }
}
