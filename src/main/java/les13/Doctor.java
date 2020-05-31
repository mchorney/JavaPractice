package les13;

public class Doctor {
    private Name name;
    private Specification spec;
    private Address address;

    public Doctor(Name name, Specification spec, Address address) {
        this.name = name;
        this.spec = spec;
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Specification getSpec() {
        return spec;
    }

    public void setSpec(Specification spec) {
        this.spec = spec;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
