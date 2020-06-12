package homework19;

import homework18.Address;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Agricultural potato=new Agricultural("potato",2);
        Agricultural corn=new Agricultural("corn",5);
        List <Agricultural> plants=new ArrayList<>();
        plants.add(potato);
        plants.add(corn);
        Map<Cattle,Integer> cattles=new HashMap<>();
        cattles.put(Cattle.COWS,3);
        cattles.put(Cattle.SHEEP,5);
        cattles.put(Cattle.PIGS,8);
        cattles.put(Cattle.CHICKENS,15);
        cattles.put(Cattle.TURKEYS,10);
        Address address=new Address("7845 Park Rd","Plano","Texas",75075);
        Farm star=new Farm("Star", address,cattles,plants);

        star.printInfo();

//        for (Agricultural a:plants) {
//            System.out.println(a.getNameOfCulture()+" - field number "+a.getFieldsNumber());
//        }
    }
}
