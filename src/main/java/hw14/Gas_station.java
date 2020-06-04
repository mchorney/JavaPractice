package hw14;

public class Gas_station extends Address {
    private String name;
    private int pumpsCount;

    public Gas_station(String name, int pumpsCount) {
        this.name = name;
        this.pumpsCount = pumpsCount;
    }

    public Gas_station(int buildingNumber, String street, City city, State state, int zipcode, String name, int pumpsCount) {
        super(buildingNumber, street, city, state, zipcode);
        this.name = name;
        this.pumpsCount = pumpsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPumpsCount() {
        return pumpsCount;
    }

    public void setPumpsCount(int pumpsCount) {
        this.pumpsCount = pumpsCount;
    }


    @Override
    public void printInfo() {
        System.out.println("Gas_station{" +
                "name='" + name + '\'' +
                ", pumpsCount=" + pumpsCount +
                ", buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city=" + city +
                ", state=" + state +
                ", zipcode=" + zipcode +
                '}');
    }
}
