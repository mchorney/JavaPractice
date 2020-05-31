package homework12;

public class Processor {
    private SocketType type;
    private int numCores;
    private String model;

    public Processor(SocketType type, int numCores, String model) {
        this.type = type;
        this.numCores = numCores;
        this.model = model;
    }

    public SocketType getType() {
        return type;
    }

    public void setType(SocketType type) {
        this.type = type;
    }

    public int getNumCores() {
        return numCores;
    }

    public void setNumCores(int numCores) {
        this.numCores = numCores;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void printInfo() {
        System.out.println("Processor{" +
                "type=" + type +
                ", numCores=" + numCores +
                ", model='" + model + '\'' +
                '}');
    }
}
