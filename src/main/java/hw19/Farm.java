package hw19;

import hw18.Address;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle,Integer> cattle;
    private ArrayList<AgriCultural> agriCultural;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, ArrayList<AgriCultural> agriCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agriCultural = agriCultural;
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

    public ArrayList<AgriCultural> getAgriCultural() {
        return agriCultural;
    }

    public void setAgriCultural(ArrayList<AgriCultural> agriCultural) {
        this.agriCultural = agriCultural;
    }


    public void printInfo(){
        System.out.println(
                "-------------------------------------------"
        );
        System.out.println("~Info about the "+name+" Farm~"+"\n-------------------------------------------"+"\nAddress: " + address +
                "\nCattle: " + cattle + "\nAgricultural: " + agriCultural);
    }
}
