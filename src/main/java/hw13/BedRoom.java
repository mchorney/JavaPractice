package hw13;

public class BedRoom {
    private int windows;
    private double square;

    public BedRoom(int windows, double square) {
        this.windows = windows;
        this.square = square;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
