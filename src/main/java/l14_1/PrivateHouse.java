package l14_1;

import l14.Address;
import l14.Person;

public class PrivateHouse extends House {
    protected l14.Person owner;

    public PrivateHouse(Address address, int squareFeet, int numberOfFloors, boolean isBasement, Person owner) {
        super(address, squareFeet, numberOfFloors, isBasement);
        this.owner = owner;
    }
}
