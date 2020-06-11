package hw19;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<Cattle,Integer> cattle = new HashMap<>();
        List<AgreeCultural> agcul = new ArrayList<>();
        Address uadd = new Address("589 Flowers", "Pasadena", "California", 5647834);

        cattle.put(Cattle.CHICKENS,27);
        cattle.put(Cattle.COWS,3);
        cattle.put(Cattle.PIGS,15);
        cattle.put(Cattle.SHEEPS,5);

        agcul.add(new AgreeCultural("Potatoes",10));
        agcul.add(new AgreeCultural("Strawberry",3));
        agcul.add(new AgreeCultural("Cabbage",3));
        agcul.add(new AgreeCultural("Corn",6));

        Farm unicorn = new Farm("Unicorn", uadd,cattle, agcul);
        unicorn.printInfo();


    }
}
