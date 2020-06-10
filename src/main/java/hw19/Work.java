package hw19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Work {
    public static void main(String[] args) {
//        List<String> xx = new ArrayList<>();
//        //xx.get(5);
//        //ArrayList<String> zz;
//        //zz.add("HEllo");
//        try{
//            int x = 5/0;
//        } catch (Exception ex){
//            System.out.println(ex);
//        }
//
//        try{
//            xx.get(5);
//            //throw ex;
//        } catch (Exception ex){
//            System.out.println(ex);
//        } finally {
//            System.out.printf("anyway");
//        }
//        public class Farm {
//            private String name;
//            *private Address address;
//            *private HashMap<Cattle, Integer> cattle;
//            ArrayList<AgreeCultural> agreeCultural;

        Address ad1 = new Address("101 Farm St", "Denver", "CO", 80206);

        HashMap<Cattle, Integer> listCattle = new HashMap<>();
        listCattle.put(Cattle.CHICKENS, 56);
        listCattle.put(Cattle.COWS, 13);
        listCattle.put(Cattle.PIGS, 65);
        listCattle.put(Cattle.SHEEPS, 2);
        listCattle.put(Cattle.TURKEYS, 120);

//        public class AgreeCultural {
//            private String nameOfCulture;
//            private int fieldsNumber;
        List<AgreeCultural> AC = new ArrayList<AgreeCultural>();
        AgreeCultural f1 = new AgreeCultural("Oves", 1);
        AgreeCultural f2 = new AgreeCultural("Corn", 2);
        AgreeCultural f3 = new AgreeCultural("Grass", 1);

        AC.add(f1);AC.add(f2);AC.add(f3);
        Farm farm1 = new Farm("Denver Farm", ad1, listCattle,AC);
        System.out.println(farm1.printInfo());

    }
}
