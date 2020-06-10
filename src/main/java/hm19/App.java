package hm19;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Address animalFarmAddress = new Address("5275 Del Mar Mesa Rd", "San Diego", "California", 92130);
        Agricultural rise = new Agricultural("Rise", 1);
        Agricultural wheat = new Agricultural("Wheat", 2);
        Agricultural tobacco = new Agricultural("Tobacco", 3);
        Agricultural cotton = new Agricultural("Cotton", 4);
        Agricultural tea = new Agricultural("Tea", 5);
        Agricultural coconut = new Agricultural("Coconut", 6);

        ArrayList<Agricultural> agricultural = new ArrayList<>();
        agricultural.add(rise);
        agricultural.add(wheat);
        agricultural.add(tobacco);
        agricultural.add(cotton);
        agricultural.add(tea);
        agricultural.add(coconut);

        Map<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.COWS, 150);
        cattle.put(Cattle.SHEEP, 120);
        cattle.put(Cattle.CHICKENS, 100);
        cattle.put(Cattle.TURKEYS, 250);



        Farm farm = new Farm("The Farm at Del Mar Meadows", animalFarmAddress, cattle, agricultural);
        farm.farmInfo();
    }







}
