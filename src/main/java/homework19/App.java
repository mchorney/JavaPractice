package homework19;

import homework18.Address;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address address = new Address("410 130th Pl SE", "Bellevue", "WA", 98005);
        Map<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.CHICKENS, 1);
        cattle.put(Cattle.COWS, 2);
        cattle.put(Cattle.DUCK, 3);
        cattle.put(Cattle.RABBIT, 4);
        cattle.put(Cattle.GOAT, 5);
        cattle.put(Cattle.PIGS, 6);
        cattle.put(Cattle.SHEEPS, 7);
        cattle.put(Cattle.TURKEYS, 8);
        AgreeCultural wheat = new AgreeCultural("Wheat", 1);
        AgreeCultural barley = new AgreeCultural("Barley", 2);
        AgreeCultural soybean = new AgreeCultural("Soybean", 3);
        AgreeCultural emmer = new AgreeCultural("Emmer", 4);
        AgreeCultural pea = new AgreeCultural("Pigeon pea", 5);
        AgreeCultural rapeseed = new AgreeCultural("Rapeseed", 6);
        List<AgreeCultural> agreeCultural = new ArrayList<>();
        agreeCultural.add(wheat);
        agreeCultural.add(barley);
        agreeCultural.add(soybean);
        agreeCultural.add(emmer);
        agreeCultural.add(pea);
        agreeCultural.add(rapeseed);
        Farm farm = new Farm("Kelsey Creek Farm", address, cattle, agreeCultural);
        farm.printInfo();
    }
}
