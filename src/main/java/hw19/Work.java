package hw19;

import hw18.Address;
import les13.States;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Work {
    public static void main(String[] args) {
        /*Создайте класс Farm
                fields
        private String name;
        private Address address; (same as in HW 18)
        private HashMap<Cattle,Integer> cattle; (Cattle - enum - Cattle.COWS,     Cattle.SHEEPS, Cattle.PIGS, Cattle.CHICKENS, Cattle.TURKEYS... Value    - Integer - количество голов каждого вида)
        private ArrayList<AgriCultural> agreeCultural; (AgriCultural - class
        private String nameOfCulture;
        private int fielsNumber;

        метод printInfo() - выводит на печать всю информацию по ферме*/

        Map<Cattle,Integer> cattle = new HashMap<>();
        cattle.put(Cattle.COWS,60);
        cattle.put(Cattle.GOATS,25);
        cattle.put(Cattle.CHICKEN,50);
        cattle.put(Cattle.DUCKS,20);
        cattle.put(Cattle.TURKEYS,30);
        cattle.put(Cattle.PIGS,28);
        cattle.put(Cattle.RABBIT,31);
        cattle.put(Cattle.SHEEP,16);
        cattle.put(Cattle.GEESE,34);

        List<AgriCultural> agriCulturals = new ArrayList<>();
        AgriCultural hemp = new AgriCultural("Hemp",1);
        AgriCultural flex = new AgriCultural("Flex",3);
        AgriCultural livestockFeed = new AgriCultural("Livestock Feed for animals",4);
        AgriCultural grapes = new AgriCultural("Grapes",2);
        agriCulturals.add(hemp);
        agriCulturals.add(flex);
        agriCulturals.add(livestockFeed);
        agriCulturals.add(grapes);

        Address farm = new Address("250 Veterans Memorial Hwy","Hauppauge","NY", 11788);

        Farm superFarm = new Farm("Super Creation",farm,cattle,agriCulturals);
        superFarm.printInfo();

    }
}
