package l13;

public class Address {
    private String streetAddress;
    private String town;
    private States state;
    private int zip;

    public Address(String streetAddress, String town, States state, int zip) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zip = zip;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void printOut() {
        String address = "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", town='" + town + '\'' +
                ", state=" + state +
                ", zip=" + zip +
                '}';
        System.out.println(address);
    }


}
