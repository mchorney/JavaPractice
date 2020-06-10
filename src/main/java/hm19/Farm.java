package hm19;

import java.util.ArrayList;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map<Cattle, Integer> cattle;
    private ArrayList<Agricultural> agricultural;

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, ArrayList<Agricultural> agricultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agricultural = agricultural;
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

    public ArrayList<Agricultural> getAgricultural() {
        return agricultural;
    }

    public void setAgricultural(ArrayList<Agricultural> agricultural) {
        this.agricultural = agricultural;
    }

    public void farmInfo() {
        System.out.println("Farm name: " + getName());
        System.out.println("Farm address: " + address.addressInfo());
        cattle.forEach((animal, quantity) -> System.out.println("Animal type: " + animal + ", quantity: " + quantity));
        agricultural.forEach(agricultural1 -> System.out.println(agricultural1.agriculturallInfo()));
        }
}
