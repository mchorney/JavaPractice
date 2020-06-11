package hw19.farm;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Address address = new Address("123 hampton St", "Sometown", "NY", 12345);

        Map<Cattle, Integer> cattleMap = new HashMap<Cattle, Integer>();
        cattleMap.put(Cattle.CHICKENS, 1);
        cattleMap.put(Cattle.COWS, 2);
        cattleMap.put(Cattle.PIGS, 3);
        cattleMap.put(Cattle.SHEEPS, 4);
        cattleMap.put(Cattle.TURKEYS, 5);

        List<AgreeCultural> agreeCultural = new ArrayList<AgreeCultural>();
        AgreeCultural wheat = new AgreeCultural("Wheat", 2);
        AgreeCultural barley = new AgreeCultural("Barley", 4);
        AgreeCultural rye = new AgreeCultural("Rye", 3);
        Collections.addAll(agreeCultural, wheat, barley, rye);

        Farm farm = new Farm("Super Farm", address, cattleMap, agreeCultural);
        farm.printInfo();
    }

}
