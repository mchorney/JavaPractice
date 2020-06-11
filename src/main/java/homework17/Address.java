package homework17;

public class Address {
    private String town;
    private String streetAddress;

    public Address(String town, String streetAddress) {
        this.town = town;
        this.streetAddress = streetAddress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public void stAd(){
        System.out.println(streetAddress+", "+town+" ");
    }
}
