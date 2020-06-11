package hw19.farm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle, Integer> cattle;
    private ArrayList<AgreeCultural> agreeCultural;

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = (HashMap)cattle;
        this.agreeCultural = (ArrayList)agreeCultural;
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

    public HashMap<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(HashMap<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public ArrayList<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void setAgreeCultural(ArrayList<AgreeCultural> agreeCultural) {
        this.agreeCultural = agreeCultural;
    }

    public void printInfo() {
        System.out.println("Farm name: " + name);
        address.printInfo();
        System.out.println("Cattle contains: " + cattle);
        System.out.println("List of fields:");
        agreeCultural.forEach(element -> element.printInfo());
    }
}
