package hw19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Address ad1 = new Address("145 Main St", "Buffalo", "TX", 65432);

        HashMap<Cattle, Integer> listCattle = new HashMap<>();
        listCattle.put(Cattle.PIGS, 45);
        listCattle.put(Cattle.COWS, 18);
        listCattle.put(Cattle.CHICKENS, 73);
        listCattle.put(Cattle.TURKEYS, 35);
        listCattle.put(Cattle.SHEEPS, 24);

        List<AgreeCultural> agreeCultural = new ArrayList<AgreeCultural>();
        AgreeCultural wheat = new AgreeCultural("Wheat", 2);
        AgreeCultural corn = new AgreeCultural("Corn", 3);
        AgreeCultural cotton = new AgreeCultural("Cotton", 1);

        agreeCultural.add(wheat);
        agreeCultural.add(corn);
        agreeCultural.add(cotton);
        Farm farm1=new Farm("Green way",ad1,listCattle,agreeCultural);
        System.out.println(farm1.printInfo());

    }
}
