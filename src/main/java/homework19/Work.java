package homework19;

import java.util.ArrayList;
import java.util.HashMap;

public class Work {
    public static void main(String[] args) {

        Address farm = new Address("2331 Savannah hills ","Charlotte","NC",28277);

        HashMap cattle = new HashMap();
        cattle.put(Cattle.Chickens,1000);
        cattle.put(Cattle.Cows,100);
        cattle.put(Cattle.Pigs,200);
        cattle.put(Cattle.Sheeps,300);

        Agreecultural rye = new Agreecultural("Rye",5);
        Agreecultural wheat = new Agreecultural("Wheat",10);
        Agreecultural corn = new Agreecultural("Corn",25);



        ArrayList agreecultural = new ArrayList();
        agreecultural.add(rye);
        agreecultural.add(corn);
        agreecultural.add(wheat);

        Farm bigFarm = new Farm("Happy Family Farm",farm,cattle,agreecultural);

        System.out.println(bigFarm.toString());



    }
}
