package hw19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle, Integer> cattle;
    List<AgreeCultural> agreeCultural;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, List<AgreeCultural> agreeCultural) {
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

    public HashMap<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(HashMap<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public List<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void setAgreeCultural(ArrayList<AgreeCultural> agreeCultural) {
        this.agreeCultural = agreeCultural;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", cattle=" + cattle +
                ", agreeCultural=" + agreeCultural.toString() +
                '}';
    }
    public String printInfo(){
        return this.toString();
    }
}