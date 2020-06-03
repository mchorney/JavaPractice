package l14;

public class PrivateHouse extends House {
    protected Person owner;

    public PrivateHouse(Address address, int squareFeet, int numberOfFloors, boolean isBasement, Person owner) {
        super(address, squareFeet, numberOfFloors, isBasement);
        this.owner = owner;
    }
}
