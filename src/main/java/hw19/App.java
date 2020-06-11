package hw19;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Address address = new Address("E Adams blvd", "Chidester", "Arkansas", 71726);

        Map<Cattle,Integer> cattle = new HashMap<>();
        cattle.put(Cattle.CHICKENS, 50);
        cattle.put(Cattle.COWS, 33);
        cattle.put(Cattle.HORSES, 9);
        cattle.put(Cattle.PIGS, 15);
        cattle.put(Cattle.SHEEPS, 128);
        cattle.put(Cattle.TURKEYS, 30);


        AgreeCultural swede = new AgreeCultural("Swede", 8);
        AgreeCultural turnip = new AgreeCultural("Turnip", 5);
        AgreeCultural beet = new AgreeCultural("Beet", 7);
        List<AgreeCultural> plants = new ArrayList<>();
        plants.add(swede);
        plants.add(turnip);
        plants.add(beet);

        Farm farm = new Farm("Your grandpa farm", address, cattle, plants);
        farm.printInfo();
    }
}
