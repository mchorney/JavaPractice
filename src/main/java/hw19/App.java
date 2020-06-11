package hw19;

import java.util.*;

public class App {
    public static void main(String[] args) {
        HashMap<Cattle,Integer> cattle = new HashMap<>();
        cattle.put(Cattle.TURKEY,12);
        cattle.put(Cattle.CHIKENS, 20);
        cattle.put(Cattle.COWS,15);
        cattle.put(Cattle.PIGS, 10);
        cattle.put(Cattle.SHEEPS,5);


        Address adr1 = new Address("256 Greedy St", "Colban", "WA", 98345);
        Address adr2 = new Address("74 Sunny St S", "Welden", "CO", 76045);
        Address adr3 = new Address("134 Denver Ave S", "Denver", "CO", 76940);
        Address adr4 = new Address("124 Beach St", "Sunlight", "CA", 10734);
        Address adr5 = new Address("23 Ave S", "Newhalem", "WA", 98138);
        Address adr6 = new Address("214 Rondel St", "Gretten", "WI", 75334);
        Address adr7 = new Address("12 Colby Ave", "Berrien Springs", "MI", 96234);



        Agricultural agr1 = new Agricultural("Potato", 4);
        Agricultural agr2 = new Agricultural("Buckwheat", 2);
        Agricultural agr3 = new Agricultural("Tomatoes", 1);
        Agricultural agr4 = new Agricultural("Salads", 2);
        Agricultural agr5 = new Agricultural("Paper", 1);
        Agricultural agr6 = new Agricultural("Flopwers", 2);
        Agricultural agr7 = new Agricultural("Eggplants",1);

        ArrayList<Agricultural> agriculturals = new ArrayList<>();
        agriculturals.add(agr1);
        agriculturals.add(agr2);
        agriculturals.add(agr3);
        agriculturals.add(agr4);
        agriculturals.add(agr5);
        agriculturals.add(agr6);
        agriculturals.add(agr7);


        String farmName = "Andrews University Farm";
        Farm nf = new Farm(farmName,adr7,cattle,agriculturals);

        nf.printInfo();
        System.out.println("****************************************");

        nf.printCattle();
        System.out.println("****************************************");

        nf.printAgricultural();









    }
}
