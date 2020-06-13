package hw19;

import hw18.Address;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<Cattle, Integer> cattleIntegerMap = new HashMap<Cattle, Integer>();
        cattleIntegerMap.put(Cattle.CHICKENS,50);
        cattleIntegerMap.put(Cattle.DUCKS,35);
        cattleIntegerMap.put(Cattle.PIGS, 20);
        cattleIntegerMap.put(Cattle.COWS, 15);
        cattleIntegerMap.put(Cattle.TURKEYS ,25);

        List<AgreeCultural>agreeCulturalList= new ArrayList<AgreeCultural>();        ;
        agreeCulturalList.add(new AgreeCultural("wheat",5));
        agreeCulturalList.add(new AgreeCultural("backweat",3));
        agreeCulturalList.add(new AgreeCultural("corn",12));
        agreeCulturalList.add(new AgreeCultural("soybeans",4));

        Farmfields rainbow= new Farmfields("Rainbow",new Address("3 rd Street","Newton","IA",50226),
                cattleIntegerMap, (List<AgreeCultural>) agreeCulturalList);

        rainbow.printInfo();
    }

}
