package l12;

public class Schools {
    private String name;
    private SchoolType schoolType;
    private Address address;

    public Schools(String name, SchoolType schoolType, Address address) {
        this.name = name;
        this.schoolType = schoolType;
        this.address = address;
    }
    public void printOut() {
        System.out.println("School name = " +name + "Type = " + schoolType);
        address.printOut();
    }
}

