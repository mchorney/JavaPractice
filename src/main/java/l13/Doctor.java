package l13;

public class Doctor {
    private Name name;
    private Specialization spec;
    private Address homeAddress;

    public Doctor(Name name, Specialization spec, Address homeAddress) {
        this.name = name;
        this.spec = spec;
        this.homeAddress = homeAddress;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Specialization getSpec() {
        return spec;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }


    public void setSpec(Specialization spec) {
        this.spec = spec;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }
}
