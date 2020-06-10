package hw19;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {


        List<AgriCultural>agroList= new ArrayList<AgriCultural>();
        AgriCultural wheat = new AgriCultural("Wheat", 1);
        AgriCultural beans = new AgriCultural("Beans", 2);
        AgriCultural fruits = new AgriCultural("Fruits", 3);

        agroList.add(wheat);
        agroList.add(beans);
        agroList.add(fruits);

        System.out.println("******************Check the culture print********");
        wheat.printAgreecult();

//
//        System.out.println(("*****************I can't print out this function"));
//        agroList.forEach (agroList::);



        Addresss farmVillage = new Addresss("2001 Crosshair str", "Orlando","Fl", 12345 );

        Map<Cattle,Integer> cattle = new HashMap<>();
        cattle.put(Cattle.CHICKENS, 500);
        cattle.put(Cattle.COWS, 165);
        cattle.put(Cattle.PIGS, 354);
        cattle.put(Cattle.SHEEPS, 98);
        cattle.put(Cattle.TURKEYS, 480);

        System.out.println("******************Check the Hashmap*********");
        for (Map.Entry<Cattle, Integer> entry : cattle.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());}


        Farm village = new Farm("Farm Village", farmVillage, cattle, agroList);

        System.out.println("****************final method to print**************");
        village.printInfo();


    }

}
