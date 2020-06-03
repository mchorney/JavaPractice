package les14;

import les13.Address;

public class PrivateHouse extends House {
    protected Person owner;

    public PrivateHouse(Address address, int squarefeet, int numberOfFloors, boolean isbasement, Person owner) {
        super(address, squarefeet, numberOfFloors, isbasement);
        this.owner = owner;
    }


}
