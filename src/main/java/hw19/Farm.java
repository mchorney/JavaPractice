package hw19;


import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map<Cattle,Integer> cattle;
    private List<AgreeCultural> agreeCultural;

    public Farm() {
    }

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
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

    public Map<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(Map<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public List<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void setAgreeCultural(List<AgreeCultural> agreeCultural) {
        this.agreeCultural = agreeCultural;
    }

    public void printInfo() {
        System.out.println("Welcome to the " + "'" + name + "'" + " farm.");
        System.out.println("Our farm located at the next address: " + address.getObjectAddress());
        System.out.println();
        System.out.println("There is next livestock living here: ");
        for (Map.Entry<Cattle, Integer> entry : cattle.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue() + " heads.");
        }
        System.out.println();
        System.out.println("Plants are presented also in the next amount:");
        for (AgreeCultural plant : agreeCultural) System.out.println(plant.getNameOfCulture() + " " + plant.getFieldsNumber() + " fields.");
    }
}
