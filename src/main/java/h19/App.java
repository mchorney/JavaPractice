package h19;


import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Address address = new Address("1500 Marilla St","Dallas","TX",75201);

        HashMap<Cattle,Integer> cattle=new HashMap<Cattle,Integer>();
        cattle.put(Cattle.PIGS,25);
        cattle.put(Cattle.CHICKENS,50);
        cattle.put(Cattle.COWS,30);
        cattle.put(Cattle.DUCKS,30);
        cattle.put(Cattle.SHEEPS,40);
        cattle.put(Cattle.HOURSE,10);

        ArrayList<AgreeCultural>agreeCultural = new ArrayList<AgreeCultural>();
        AgreeCultural grain = new AgreeCultural("Grain",1);
        AgreeCultural sugarBeet = new AgreeCultural("SugarBeet",2);
        AgreeCultural sunflowerSeeds = new AgreeCultural("SunflowerSeeds",3);
        AgreeCultural potatoes = new AgreeCultural("Potatoes",4);

        agreeCultural.add(grain);
        agreeCultural.add(sugarBeet);
        agreeCultural.add(sunflowerSeeds);
        agreeCultural.add(potatoes);
        Farm farm1=new Farm("SunDorn Farm",address,cattle,agreeCultural);

        farm1.printInfo();
    }
}
