package les12_13;

public class School {
    private String name;
    private SchoolType schoolType;
    private ADDRESS address;

    public School(String name, SchoolType schoolType, ADDRESS address) {
        this.name = name;
        this.schoolType = schoolType;
        this.address = address;
    }
    public void printOut(){
        System.out.println("School name = "+name+" Type = "+schoolType);
        address.print();
    }
}
