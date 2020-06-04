package hw14;

public class Store extends Game{
    private String streetAddress;
    private String town;
    private String state;
    private int zip;
    private long phone;

    public Store(String name, String streetAddress, String town, String state, int zip, long phone) {
        super(name);
        this.streetAddress = streetAddress;
        this.town = town;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Store{" +
                " Name= " + name +'\'' +
                ", Street Address='" + streetAddress + '\'' +
                ", Town='" + town + '\'' +
                ", State='" + state + '\'' +
                ", Zip=" + zip +
                ", Phone=" + phone +
                '}';
    }
}
