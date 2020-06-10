package hw19;

/*
Создайте класс Farm
private String name;
private Address address; (same as in HW 18)
private HashMap<Cattle,Integer> cattle; (Cattle - enum - Cattle.COWS,     Cattle.SHEEPS, Cattle.PIGS, Cattle.CHICKENS,
Cattle.TURKEYS... Value    - Integer - количество голов каждого вида)
private ArrayList<AgreeCultural> agreeCultural; (AgreeCultural - class
    private String nameOfCulture;
    private int fielsNumber;
метод printInfo() - выводит на печать всю информацию по ферме
 */

import java.util.*;

public class App {
    public static void main(String[] args) {

        Address address = new Address("123 hampton St", "Sometown", "NY", 12345);
        HashMap<Cattle, Integer> cattleMap = new HashMap<Cattle, Integer>();
        cattleMap.put(Cattle.CHICKENS, 1);
        cattleMap.put(Cattle.COWS, 2);
        cattleMap.put(Cattle.PIGS, 3);
        cattleMap.put(Cattle.SHEEPS, 4);
        cattleMap.put(Cattle.TURKEYS, 5);
        ArrayList<AgreeCultural> agreeCultural = new ArrayList<AgreeCultural>();
        AgreeCultural wheat = new AgreeCultural("Wheat", 2);
        AgreeCultural barley = new AgreeCultural("Barley", 4);
        AgreeCultural rye = new AgreeCultural("Rye", 3);
        Collections.addAll(agreeCultural, wheat, barley, rye);
        Farm farm = new Farm("Super Farm", address, cattleMap, agreeCultural);
        farm.printInfo();
    }

}
