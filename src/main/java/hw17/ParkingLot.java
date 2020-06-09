package hw17;

public class ParkingLot {
    private String parking;
    private int row;

    public ParkingLot(String parking, int raw) {
        this.parking = parking;
        this.row = row;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    void printInfo (){
        System.out.println("Parking is "+ parking + " Row number is " + row);
    }

    @Override
    public String toString() {
        return "Parking{" +
                "Parking='" + parking + '\'' +
                ", row=" + row +
                '}';
    }
}