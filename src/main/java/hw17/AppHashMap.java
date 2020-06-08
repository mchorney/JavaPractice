package hw17;

import hw14.*;
import hw15.Lightning;
import hw15.RainTypes;
import hw15.Raining;
import hw15.Storm;

import java.util.*;

public class AppHashMap {
    public static void main(String[] args) {


        // HashMap <String, String>

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("One", "Snow");
        stringMap.put("Two", "Small Hail");
        stringMap.put("Tree", "Radiation Fog");
        stringMap.put("Four", "Advection Fog");
        System.out.println(stringMap);

        stringMap.replace("One", "Ice Crystals");
        System.out.println(stringMap);

        stringMap.remove("Four");
        System.out.println(stringMap);

        System.out.println(stringMap.get("One"));

        stringMap.forEach((k, v) -> {
            System.out.format("key: %s, value: %s%n", k, v);
        });

        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (String v : stringMap.values()) {
            System.out.println(v);
        }

        for (String k : stringMap.keySet()) {
            System.out.println(k);
        }



        // HashMap<Integer, String>

        Map<Integer, String> integerMap = new HashMap<>();
        integerMap.put(8, "One");
        integerMap.put(0, "Two");
        integerMap.put(5, "Three");
        integerMap.put(12, "Four");
        System.out.println(integerMap);

        integerMap.replace(0, "Fife");
        System.out.println(integerMap);

        integerMap.remove(5);
        System.out.println(integerMap);

        System.out.println(integerMap.get(12));

        integerMap.forEach((k, v) -> {
            System.out.format("key: %d, value: %s%n", k, v);
        });

        for (Map.Entry<Integer, String> entry : integerMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (String v : integerMap.values()) {
            System.out.println(v);
        }

        for (Integer k : integerMap.keySet()) {
            System.out.println(k);
        }



        // HashMap<Object1, Object2>

        Vehicle veh1 = new Car(4, true, Brand.MERCEDES, 5, "Sedan", "Motor");
        Vehicle veh2 = new Plane(8, false, Brand.CHRYSLER, "Jet", 6);
        Vehicle veh3 = new Bicycle(3, false, Brand.TOYOTA, 0, "Mount Bike", "Legs", 1, "Metal");
        Vehicle veh4 = new Car(4, true, Brand.TOYOTA, 5, "Sedan", "Motor");
        Vehicle veh5 = new Plane(12, false, Brand.HONDA, "Jet", 12);
        Vehicle veh6 = new Bicycle(2, false, Brand.CHRYSLER, 0, "Mount Bike", "Legs", 1, "Metal");

        Storm rain = new Raining(RainTypes.CONVECTIONAL, 25, true);
        Storm lightning = new Lightning(8, 10, "Boom", true);
        Storm rain1 = new Raining(RainTypes.OROGRAPHIC, 20, true);
        Storm lightning2 = new Lightning(5, 11, "Loud", true);
        Storm rain3 = new Raining(RainTypes.CYCLONIC, 100, true);
        Storm lightning4 = new Lightning(15, 16, "Bow", true);

        Map<Storm, Vehicle> objectMap  = new HashMap<>();
        objectMap.put(rain1, veh1);
        objectMap.put(rain3, veh2);
        objectMap.put(lightning, veh3);
        objectMap.put(lightning2, veh4);
        System.out.println(objectMap);

        objectMap.replace(lightning, veh5);
        System.out.println(objectMap);

        objectMap.remove(lightning2);
        System.out.println(objectMap);

        System.out.println(objectMap.get(lightning));

        objectMap.forEach((k, v) -> {
            System.out.format("key: %s, value: %s%n", k, v);
        });

        for (Map.Entry<Storm, Vehicle> entry : objectMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (Vehicle v : objectMap.values()) {
            System.out.println(v);
        }

        for (Storm k : objectMap.keySet()) {
            System.out.println(k);
        }
    }
}
