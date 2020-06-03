package l14_1;

import l14.Address;

public class House {
    protected l14.Address address;
    protected int squareFeet;
    protected int numberOfFloors;
    public boolean isBasement;

    public House(Address address, int squareFeet, int numberOfFloors, boolean isBasement) {
        this.address = address;
        this.squareFeet = squareFeet;
        this.numberOfFloors = numberOfFloors;
        this.isBasement = isBasement;
    }

    public void printMe() {
        System.out.println("House{" +
                "address=" + address +
                ", squareFeet=" + squareFeet +
                ", numberOfFloors=" + numberOfFloors +
                ", isBasement=" + isBasement +
                '}');
    }
}
