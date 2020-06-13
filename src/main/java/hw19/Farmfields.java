package hw19;


import hw18.Address;

import java.util.List;
import java.util.Map;

public class Farmfields {
    private String name;
    private Address address;
    private Map<Cattle,Integer> cattle;
    private List<AgreeCultural> agreeCultural;

    public Farmfields(String name, Address address, Map<Cattle, Integer> cattle, List<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
    }

    @Override
    public String toString() {
        return "Farmfields{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", cattle=" + cattle +
                ", agreeCultural=" + agreeCultural +
                '}';
    }
    public void printCattle(){
        cattle.forEach((x, y) -> System.out.println(x + "," + y));
    }
    public void printAgree(){
        agreeCultural.forEach(x-> System.out.println(x));
    }

    public void printInfo(){
        System.out.println("Farmfield name: "+name +", Address: "+address);
        printCattle();
        printAgree();
    }

//    public void pintInfo1(){
//        System.out.println("Farmfield name: "+name +", Address: "+address+", Cattle:"+printCattle(cattle);+", Agreecultural: "+ printAgree(agreeCultural));
//    }

}

