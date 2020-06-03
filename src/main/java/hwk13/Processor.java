package hwk13;

public class Processor {
    private CPUManufacturer maker;
    private int speed;
    private int core;

    public Processor(CPUManufacturer maker, int speed, int core) {
        this.maker = maker;
        this.speed = speed;
        this.core = core;
    }

    public CPUManufacturer getMaker() {
        return maker;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCore() {
        return core;
    }

    public void printIfo() {
        System.out.println("Processor{" +
                "maker=" + maker +
                ", speed=" + speed +
                ", core=" + core +
                '}');
    }
}
