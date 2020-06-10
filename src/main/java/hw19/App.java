package hw19;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Address address = new Address("666 dark three", "Orlando de blum", "ZIC", 344444);

        HashMap<Cattle, Integer> cattle = new HashMap<Cattle, Integer>();
        cattle.put(Cattle.PIGS, 1);
        cattle.put(Cattle.CHICKENS, 2);
        cattle.put(Cattle.COWS, 5);
        cattle.put(Cattle.DUCKS, 3);
        cattle.put(Cattle.SHEEPS, 6);
        cattle.put(Cattle.HOURSE, 4);

        ArrayList<AgreeCultural> agreeCultural = new ArrayList<AgreeCultural>();
        AgreeCultural raps = new AgreeCultural("potato", 1000);
        AgreeCultural buckheat = new AgreeCultural("coffee", 200000);
        AgreeCultural barley = new AgreeCultural("Beans", 300000);
        AgreeCultural wheat = new AgreeCultural("Wheat", 400);

        agreeCultural.add(raps);
        agreeCultural.add(buckheat);
        agreeCultural.add(barley);
        agreeCultural.add(wheat);
        Farm farm1 = new Farm("Good way", address, cattle, agreeCultural);
        farm1.printInfo();
    }
}
