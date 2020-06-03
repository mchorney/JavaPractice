package les14;

import les13.Address;

public class CountryHouse extends PrivateHouse{
    public boolean isCattle;

    public CountryHouse(Address address, int squarefeet, int numberOfFloors, boolean isbasement, Person owner, boolean isCattle) {
        super(address, squarefeet, numberOfFloors, isbasement, owner);
        this.isCattle = isCattle;
    }


    @Override
    public void printMe(){
        System.out.println("CountryHouse{" +
                "isCattle=" + isCattle +
                ", owner=" + owner +
                ", address=" + address.print() +
                ", squarefeet=" + squarefeet +
                ", numberOfFloors=" + numberOfFloors +
                ", isbasement=" + isbasement +
                '}');
    }
}
