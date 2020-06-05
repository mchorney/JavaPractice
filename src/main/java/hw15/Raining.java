package hw15;

public class Raining implements Storm {
    private RainTypes type;
    private int rainfall;
    private boolean isWet;

    public Raining() {
    }

    public Raining(RainTypes type, int rainfall, boolean isWet) {
        this.type = type;
        this.rainfall = rainfall;
        this.isWet = isWet;
    }

    public RainTypes getType() {
        return type;
    }

    public void setType(RainTypes type) {
        this.type = type;
    }

    public int getRainfall() {
        return rainfall;
    }

    public void setRainfall(int rainfall) {
        this.rainfall = rainfall;
    }

    public boolean isWet() {
        return isWet;
    }

    public void setWet(boolean wet) {
        isWet = wet;
    }

    @Override
    public void beginning() {
        System.out.println("First drops on the ground.");
    }

    @Override
    public void finishing() {
        System.out.println("Last drops on the ground.");
    }

    @Override
    public void continued() {
        System.out.println("Pure rain.");
    }
}
