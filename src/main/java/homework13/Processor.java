package homework13;

public class Processor {
    private String model;
    private String core;

    public Processor(String model, String core) {
        this.model = model;
        this.core = core;
    }

    public String getModel() {
        return model;
    }

    public String getCore() {
        return core;
    }

    public void printInfo() {
        System.out.println("Processor model = " + model + ", core = " + core);

    }
}
