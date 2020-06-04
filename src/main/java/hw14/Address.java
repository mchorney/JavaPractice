package hw14;


public class Address {
    protected int buildingNumber;
    protected String street;
    protected City city;
    protected State state;
    protected int zipcode;

    public Address() { }

    public Address(int buildingNumber,String street,  City city, State state, int zipcode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }


    public void printInfo() {
        System.out.println("Address: " + buildingNumber+" " + street+" street  " + city + " , " + zipcode +".");
    }

}
