package homework12;

public class Motherboard {
    private String maker;
    private String model;
    private SocketType socketType;

    public Motherboard(String maker, String model, SocketType socketType) {
        this.maker = maker;
        this.model = model;
        this.socketType = socketType;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public SocketType getSocketType() {
        return socketType;
    }

    public void setSocketType(SocketType socketType) {
        this.socketType = socketType;
    }

    public void printInfo() {
        System.out.println("Motherboard{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", socketType=" + socketType +
                '}');
    }
}
