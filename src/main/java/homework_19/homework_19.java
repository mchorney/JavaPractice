package homework_19;
//Создайте класс Farm
//fields
//private String name;
//private Address address; (same as in HW 18)
//private HashMap<Cattle,Integer> cattle; (Cattle - enum - Cattle.COWS,     Cattle.SHEEPS, Cattle.PIGS, Cattle.CHICKENS, Cattle.TURKEYS... Value    - Integer - количество голов каждого вида)
//private ArrayList<AgreeCultural> agreeCultural; (AgreeCultural - class
//    private String nameOfCulture;
//    private int fielsNumber;
//
//метод printInfo() - выводит на печать всю информацию по ферме

import homework_18.Address;
import homework_18.Position;
import l13.Computer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class homework_19 {
    public static void main(String[] args) {

        //create new cultures and fill up AgriCultural List
        AgriCultural wheat = new AgriCultural("Wheat", 1);
        AgriCultural barley = new AgriCultural("Barley", 2);
        AgriCultural corn = new AgriCultural("Corn",3);
        List<AgriCultural> culture = new ArrayList<>();
        culture.add(wheat);
        culture.add(barley);
        culture.add(corn);

        // create household animals and indicate quantity of each kind
        Map<Integer, Cattle> cattle = new HashMap<Integer,Cattle>();
        cattle.put(12, Cattle.CHICKENS);
        cattle.put(24,Cattle.COWS);
        cattle.put(35,Cattle.PIGS);
        cattle.put(46, Cattle.SHEEPS);
        cattle.put(51,Cattle.TURKEYS);

        //farm's address
        Address farmAddress = new Address("Far-far away", "Colorado Springs", "CO", 12345);

        //filling up the farm:
        Farm myFarm = new Farm("Flying Horse", farmAddress, cattle, culture);

        myFarm.printInfo();

    }
}
