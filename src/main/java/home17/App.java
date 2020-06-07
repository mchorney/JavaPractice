package home17;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<String,String> family=new HashMap<String,String>();
        family.put("Husband","Maksim");
        family.put("Wife","Antanina");
        family.put("Daughter","Alisa");
        family.put("Son","Matthew");
        System.out.println(family);
        family.replace("Son","Mat");
        System.out.println(family);
        family.put("Grandmother","Galy");
        System.out.println(family);
        family.remove("Grandmother","Galy");
        System.out.println(family);
        family.get("Wife");
        System.out.println(family);

        for(String k:family.keySet()){
            System.out.println(k);
            System.out.println(family.get(k));
        }

        HashMap<Integer,String> place=new HashMap<Integer, String>();
        place.put(1,"Gold");
        place.put(2,"Silver");
        place.put(3,"Bronse");
        place.put(4,"Iron");
        place.put(5,"Nikel");
        System.out.println(place);
        place.replace(5,"Gramota");
        System.out.println(place);
        place.remove(5,"Gramota");
        System.out.println(place);
        place.get(4);
        System.out.println(place);
        for(Integer k:place.keySet()){
            System.out.println(k);
            System.out.println(place.get(k));
        }


        HashMap<Garden,Threes> mapGarden=new HashMap<Garden,Threes>();
        Garden gardenA=new Garden("Apple",20);
        Garden gardenP=new Garden("Peach",10);
        Garden gardenO=new Garden("Orange",30);
        Garden gardenPl=new Garden("Plamb",25);
        Garden gardenB=new Garden("Banan",35);

        Threes threesA=new Threes("Apple Threes",6);
        Threes threesP=new Threes("Peach Threes",2);
        Threes threesO=new Threes("Orange Threes",2);
        Threes threesPl=new Threes("Plamb Threes",3);
        Threes threesB=new Threes("Banan",5);
        mapGarden.put(gardenA,threesA);
        mapGarden.put(gardenP,threesP);
        mapGarden.put(gardenO,threesO);
        mapGarden.put(gardenPl,threesPl);
        System.out.println(mapGarden);

        mapGarden.replace(gardenO,threesB);
        System.out.println(mapGarden);
        mapGarden.remove(gardenO,threesB);
        System.out.println(mapGarden);

        for(Garden k:mapGarden.keySet()){
            System.out.println(k);
            System.out.println(mapGarden.get(k));
        }




    }
}
