package hwk19;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address address = new Address("12345 De Soto Ave", "Woodlan Hills", "CA", 91367);
        List<AgreeCultural> agreeculture = new ArrayList<>();
        agreeculture.add(new AgreeCultural("wheat", 2));
        agreeculture.add(new AgreeCultural("barley", 1));
        agreeculture.add(new AgreeCultural("oats", 3));
        agreeculture.add(new AgreeCultural("buckwheat", 4));

        Map<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.TURKEY, 5);
        cattle.put(Cattle.CHICKEN, 6);
        cattle.put(Cattle.COW, 2);
        cattle.put(Cattle.GOAT, 2);
        cattle.put(Cattle.PIG, 3);

        Farm farm = new Farm("Jolly Roger", address, cattle, agreeculture);
        farm.printInfo();


    }
}
