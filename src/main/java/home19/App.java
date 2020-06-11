package home19;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Address address=new Address("543 Florida Ave","Orlando","FL",32929);

        Map<Cattle,Integer> cattle=new HashMap<Cattle,Integer>();
        cattle.put(Cattle.PIGS,10);
        cattle.put(Cattle.CHICKENS,25);
        cattle.put(Cattle.COWS,5);
        cattle.put(Cattle.DUCKS,20);
        cattle.put(Cattle.SHEEPS,12);
        cattle.put(Cattle.HOURSE,4);

        List<AgreeCultural>agreeCultural=new ArrayList<AgreeCultural>();
        AgreeCultural raps=new AgreeCultural("Raps",1);
        AgreeCultural buckheat=new AgreeCultural("Buckheat",2);
        AgreeCultural barley=new AgreeCultural("Barley",3);
        AgreeCultural wheat=new AgreeCultural("Wheat",4);

        agreeCultural.add(raps);
        agreeCultural.add(buckheat);
        agreeCultural.add(barley);
        agreeCultural.add(wheat);
        Farm farm1=new Farm("Good way",address,cattle,agreeCultural);
        farm1.printInfo();



    }
}
