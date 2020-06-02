package hw11;

public class Airlincompany {
    private AirlineTipe AirlineTipe;
    private String address;

    public Airlincompany(hw11.AirlineTipe airlineTipe, String address) {
        AirlineTipe = airlineTipe;
        this.address = address;
    }

    public hw11.AirlineTipe getAirlineTipe() {
        return AirlineTipe;
    }

    @Override
    public String toString() {
        return "Airlincompany{" +
            "AirlineTipe=" + AirlineTipe +
            ", address='" + address + '\'' +
            '}';
    }

    public void setAirlineTipe(hw11.AirlineTipe airlineTipe) {
        AirlineTipe = airlineTipe;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
