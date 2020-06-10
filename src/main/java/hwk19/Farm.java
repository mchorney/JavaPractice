package hwk19;

import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map<Cattle,Integer> cattle;
    private List<AgreeCultural> agreeCultural;

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
    }

    public void printInfo(){
        System.out.println("FARM INFO \nName: " + name + "; \nAddress: " + address.getAddress() + "; \nCattle: ");
        cattle.forEach((key, value) -> System.out.print(key + " : "+value + ", "));
        System.out.println("\nAgreecultural: ");
        agreeCultural.forEach(item -> System.out.print(item.getAgreecultural() + ", "));
    }

    /*public String getAgreecultural(){
        return agreeCultural.forEach(item -> item));
    }*/
}
