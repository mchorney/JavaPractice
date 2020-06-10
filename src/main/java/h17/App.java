package h17;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> car = new HashMap<String, String>();
        car.put("Dodge", "RAM");
        car.put("Ford", "Focus");
        car.put("Nissan", "X-Trail");
        car.put("BMW", "X6");
        System.out.println(car);
        car.replace("Dodge", "Caliber");
        System.out.println(car);
        car.put("Toyota", "Tundra");
        System.out.println(car);
        car.remove("Toyota", "Tundra");
        System.out.println(car);
        car.get("Tesla");
        System.out.println(car);

        for (String p : car.keySet()) {
            System.out.println(p);
            System.out.println(car.get(p));
        }

        HashMap<Integer, String> sandwich = new HashMap<Integer, String>();
        sandwich.put(1, "Bred");
        sandwich.put(2, "Meat");
        sandwich.put(3, "Cheese");
        sandwich.put(4, "Salad");
        sandwich.put(5, "Vegetables");
        sandwich.put(6, "Sauce");
        System.out.println(sandwich);
        sandwich.replace(2, "Tuna");
        System.out.println(sandwich);
        sandwich.remove(2, "Tuna");
        System.out.println(sandwich);

        for (Integer q : sandwich.keySet()) {
            System.out.println(q);
            System.out.println(sandwich.get(q));
        }

        HashMap<Fruits, Trees> mapFruits = new HashMap<Fruits, Trees>();
        Fruits fruitsA = new Fruits("Apple", 40);
        Fruits fruitsP = new Fruits("Pear", 50);
        Fruits fruitsL = new Fruits("Lemon", 30);
        Fruits fruitsG = new Fruits("Grapefruit", 60);
        Fruits fruitsK = new Fruits("Kiwi", 20);
        Fruits fruitsO = new Fruits("Orange", 70);

        Trees treesA = new Trees("Apple Trees",9);
        Trees treesP = new Trees("Pear Trees",6);
        Trees treesL = new Trees("Lemon Trees",3);
        Trees treesG = new Trees("Grapefruit Trees",4);
        Trees treesK = new Trees("Kiwi Trees",3);
        Trees treesO = new Trees("Orange Trees",7);

        mapFruits.put(fruitsA,treesA);
        mapFruits.put(fruitsP,treesP);
        mapFruits.put(fruitsL,treesL);
        mapFruits.put(fruitsG,treesG);
        mapFruits.put(fruitsK,treesK);
        mapFruits.put(fruitsO,treesO);
        System.out.println(mapFruits);
        mapFruits.replace(fruitsG, treesA);
        System.out.println(mapFruits);
        mapFruits.remove(fruitsG, treesA);
        System.out.println(mapFruits);

        for (Fruits s : mapFruits.keySet()) {
            System.out.println(s);
            System.out.println(mapFruits.get(s));
        }


    }
}
