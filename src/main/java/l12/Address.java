package l12;

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

    public void printOut() {
        String address = "Address{" + "streetAddress='" + streetAddress + '\'' + ", town='" + town + '\'' + ", state=" + state + ", zip=" + zip + '}';
        System.out.println(address);
    }


}
