package homework19;

import homework18.Address;

import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map<Cattle,Integer> cattle;
    private List<Agricultural>agricultural;

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<Agricultural> agricultural) {
        this.name = name;
        this.address = address;
        this.cattle= cattle;
        this.agricultural = agricultural;
    }
        public String getName() {
            return name;
        }

        public Address getAddress() {
            return address;
        }

        public Map<Cattle, Integer> getCattle() {
            return cattle;
        }

        public List<Agricultural> getAgricultural() {
            return agricultural;
        }
        public void printInfo(){
            System.out.println("Farm '"+name+"', address: "+address.address()+"; \n"+cattle);
            for (Agricultural a:this.agricultural) {
                System.out.println(a.getNameOfCulture()+" - field number "+a.getFieldsNumber());

            }

        }
    }

