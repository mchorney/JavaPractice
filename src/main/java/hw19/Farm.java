package hw19;

import java.util.ArrayList;
import java.util.HashMap;


public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle,Integer> cattle;
    private ArrayList<Agricultural> agricultural;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, ArrayList<Agricultural> agricultural) {
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

    public HashMap<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(HashMap<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public ArrayList<Agricultural> getAgricultural() {
        return agricultural;
    }

    public void setAgricultural(ArrayList<Agricultural> agricultural) {
        this.agricultural = agricultural;
    }

    public void printInfo() {
        System.out.println("{" +
                "FarmName='" + this.name + '\'' +
                ", Address=" + this.address.toString() +
                ", Cattle=" + this.cattle +
                ", Agricultural=" + this.agricultural.toString() +
                '}');
    }


    public void printCattle() {
        System.out.println("{" +
                "Cattle=" + this.cattle.toString() +
                '}');
    }


    public void  printAgricultural() {
        System.out.println("{" +
                "Agricultural=" + agricultural +
                '}');
    }
}
