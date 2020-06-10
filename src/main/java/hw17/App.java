package hw17;

//Создайте 3 HashMap- <String,String>, <Integer,String> и произвольного класса <Class1,Class2> (придумайте сами)
//        добавьте в каждый HashMap по 4 элемента
//        попробуйте методы put/replace/remove/get/foreach

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;


public class App {
    public static void main(String[] args) {


        Map<String, String> names = new HashMap<String, String>();
        names.put("Andrey", "Andreev");
        names.put("Sergey", "Sergeyev");
        names.put("Victoria", "Hunter");
        names.put("James", "Bond");

        System.out.println(names.get("James"));

        Set keyset = names.keySet();
        System.out.println("Keysets = " + keyset);

        names.remove("Sergey");

        System.out.println(names);

        names.replace("Andrey", "Andreev", "Andreychenko");


        System.out.println(names.values());


        for (Map.Entry n : names.entrySet()) {
            System.out.println(n.getKey() + " " + n.getValue());

        }


        Map<Integer, String> phones = new HashMap<>();
        phones.put(1, "Iphone");
        phones.put(2, "Samsung");
        phones.put(3, "Motorola");
        phones.put(4, "HTC");

        for (Map.Entry<Integer, String> entry : phones.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        for (String v : phones.values()) {
            System.out.println(v);
        }

        for (Integer k : phones.keySet()) {
            System.out.println(k);
        }

        phones.remove(3);

        phones.replace(1, "Iphone", "Google_phone");

        System.out.println(phones.get(1));
        System.out.println(phones);

        Map<Names, Cell_phones> map = new HashMap<>();
        Names victor = new Names("Victor", "Torres");
        Names gary = new Names("Gary", "West");
        Cell_phones iphone = new Cell_phones("Iphone", "Silver");
        Cell_phones motorola = new Cell_phones("Motorola", "Black");

        map.put(victor, iphone);
        map.put(gary, motorola);

        victor.printInfo();

        victor.setLastName("White");
        motorola.setColor("Grey");
        System.out.println(map.get(victor));

        System.out.println(map.get(gary));

        map.remove(gary);

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}

