package hw19;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Farm {
    private String name;
    private Address streetAddress;
    private HashMap <Cattle,Integer> cattle;
    private ArrayList<AgreeCultural> agreeCultural;

    public Farm(String name, Address streetAddress, HashMap<Cattle, Integer> cattle, ArrayList<AgreeCultural> agreeCultural) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(Address streetAddress) {
        this.streetAddress = streetAddress;
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
    public void printInfo(){

        System.out.println("farm name is "+name);
        streetAddress.printAddress();
        System.out.println("cattle is "+cattle);
        System.out.println("fiels with cultural");
        agreeCultural.forEach(elemcent -> elemcent.printInfo());

    }


}
