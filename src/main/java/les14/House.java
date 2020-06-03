package les14;

import les13.Address;

public class House {
    protected Address address;
    protected int squarefeet;
    protected int numberOfFloors;
    public boolean isbasement;

    public House(Address address, int squarefeet, int numberOfFloors, boolean isbasement) {
        this.address = address;
        this.squarefeet = squarefeet;
        this.numberOfFloors = numberOfFloors;
        this.isbasement = isbasement;
    }

    public void printMe() {
        System.out.println("House{" +
                "address=" + address.print() +
                ", squarefeet=" + squarefeet +
                ", numberOfFloors=" + numberOfFloors +
                ", isbasement=" + isbasement +
                '}');
    }
}
