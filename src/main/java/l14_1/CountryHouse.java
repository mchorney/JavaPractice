package l14_1;

import l14.Address;
import l14.Person;

public class CountryHouse extends PrivateHouse {
    public boolean isCattle;

    public CountryHouse(Address address, int squareFeet, int numberOfFloors, boolean isBasement, Person owner, boolean isCattle) {
        super(address, squareFeet, numberOfFloors, isBasement, owner);
        this.isCattle = isCattle;
    }

    @Override
    public void printMe(){
        System.out.println("CountryHouse{" +
                "isCattle=" + isCattle +
                ", owner=" + owner +
                ", address=" + address +
                ", squareFeet=" + squareFeet +
                ", numberOfFloors=" + numberOfFloors +
                ", isBasement=" + isBasement +
                '}');
    }
}
