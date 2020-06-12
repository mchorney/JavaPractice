package homework_19;

import homework_18.Address;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address; //(same as in HW 18)
    private Map<Integer,Cattle> cattle;
    private List<AgriCultural> agriCultural;

    public Farm(String name, Address address, Map<Integer,Cattle> cattle, List<AgriCultural> agriCultural) {
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

    public Map<Integer,Cattle> getCattle() {
        return cattle;
    }

    public void setCattle(Map<Integer,Cattle> cattle) {
        this.cattle = cattle;
    }

    public List<AgriCultural> getAgriCultural() {
        return agriCultural;
    }

    public void setAgriCultural(List<AgriCultural> agriCultural) {
        this.agriCultural = agriCultural;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", cattle=" + cattle +
                ", agriCultural=" + agriCultural +
                '}';
    }

    public void printInfo(){
        System.out.println("name='" + name + '\''+"\n"
                + "address=" + address +"\n"
                + "cattle=" + cattle + "\n"
                + "agriCultural=" + agriCultural);
    }
}
