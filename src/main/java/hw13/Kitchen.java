package hw13;

public class Kitchen {
    private boolean isElectrified;
    private boolean isWaterDriven;

    public Kitchen(boolean isElectrified, boolean isWaterDriven) {
        this.isElectrified = isElectrified;
        this.isWaterDriven = isWaterDriven;
    }

    public boolean isElectrified() {
        return isElectrified;
    }

    public void setElectrified(boolean electrified) {
        isElectrified = electrified;
    }

    public boolean isWaterDriven() {
        return isWaterDriven;
    }

    public void setWaterDriven(boolean waterDriven) {
        isWaterDriven = waterDriven;
    }
}