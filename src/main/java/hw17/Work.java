package hw17;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.Map;

public class Work {
    public static void main(String[] args) {
        //HashMap<String,String>// <key, value>
        Map<String, String> drink_map = new HashMap<String, String>();
        drink_map.put("Beer", "500");
        drink_map.put("Latte", "350");
        drink_map.put("Tea", "350");
        drink_map.put("Water", "750");
        System.out.println(drink_map);
        System.out.println("-");
        drink_map.put("Water", "500");
        System.out.println(drink_map);
        System.out.println("-");
        drink_map.remove("Beer");
        drink_map.put("Black Tea", "150");
        System.out.println(drink_map);
        System.out.println("-");System.out.println("-");System.out.println("-");

        Map<Integer, String> list = new HashMap<>();
        list.put(7, "Beer");
        list.put(3, "Tea");
        list.put(4, "Latte");
        list.put(9, "Special Tea");

        System.out.println(list.get(2));//no key = 2
        System.out.println(list.get(7));
        System.out.println("-");
        System.out.println(list);
        System.out.println("-");
//        for (list.Entry<String, String> entry: list.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        list.remove("Latte");
        for (Integer v: list.keySet()){
            System.out.println(v);
            System.out.println(list.get(v));
        }
//
//        for (String k: map.keySet()){
//            System.out.println(k);
//            System.out.println(map.get(k));
//        }
        System.out.println("---");System.out.println("---");System.out.println("---");

        Map<Drink, Food> mapDrinkFood = new HashMap<Drink, Food>();
        Drink beer = new Drink("Beer", 5);
        Drink tea = new Drink("Black Tea", 3);
        Drink milkTea = new Drink("Milk Tea", 5);
        Drink milk = new Drink("Milk", 2);

        Food f1 = new Food("Dry fish", 6);
        Food f2 = new Food("Dry tomatoes", 16);
        Food f3 = new Food("Chees", 8);
        Food f4 = new Food("Cake", 9);
        mapDrinkFood.put(beer, f1);
        mapDrinkFood.put(milk,f4);
        mapDrinkFood.put(milkTea, f4);
        mapDrinkFood.put(tea,f3);

        for (Drink k: mapDrinkFood.keySet()){
            System.out.println("-");
            System.out.println("Drink: " + k.getType() + ", price: " + k.getPrice());
            System.out.println("Food:" + mapDrinkFood.get(k).getType() + ", price:" + mapDrinkFood.get(k).getPrice());
        }
        System.out.println("---");
        mapDrinkFood.remove(beer);

        for (Drink k: mapDrinkFood.keySet()){
            System.out.println("-");
            System.out.println("Drink: " + k.getType() + ", price: " + k.getPrice());
            System.out.println("Food:" + mapDrinkFood.get(k).getType() + ", price:" + mapDrinkFood.get(k).getPrice());
        }
        System.out.println("---");
        System.out.println(mapDrinkFood.get(milk).getPrice() + " " + mapDrinkFood.get(milk).getType());





    }
}