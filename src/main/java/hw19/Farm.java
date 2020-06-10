package hw19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Addresss address;
    private Map<Cattle, Integer> cattle;
    private List<AgriCultural> agriCultural;

    public Farm(String name, Addresss address, Map<Cattle, Integer> cattle, List<AgriCultural> agriCultural) {
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

    public Addresss getAddress() {
        return address;
    }

    public void setAddress(Addresss address) {
        this.address = address;
    }

    public Map<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(Map<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public List<AgriCultural> getAgriCultural() {
        return agriCultural;
    }

    public void setAgriCultural(ArrayList<AgriCultural> agriCultural) {
        this.agriCultural = agriCultural;
    }

    public void printInfo() {
        System.out.println("Farm{" +
                "Farm name ='" + name);
        address.printAddress();
        printcattle();
        printAgricult();


    }


    public void printAgricult () {
        agriCultural.forEach(AgriCultural::getCulture);
    }

        public void printcattle () {
            for (Map.Entry<Cattle, Integer> entry : cattle.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }


        }
    }


