package l13;

public class Hospital {
    private String name;
    private Address address;
    private Doctor[] doctors;

    public Hospital(String name, Address address, Doctor[] doctors) {
        this.name = name;
        this.address = address;
        this.doctors = doctors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }
}
