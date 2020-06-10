package l12;

public class School {
    private String name;
    private SchoolType schoolType;
    private Address address;

    public School(String name, SchoolType schoolType, Address address) {
        this.name = name;
        this.schoolType = schoolType;
        this.address = address;
    }
    public void printOut(){
        System.out.println("School name = " + name + " Type = " + schoolType);
        address.printOut();
    }
}
