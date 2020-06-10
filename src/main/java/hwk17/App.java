package hwk17;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        /*
         -----------------CREATING Integer, String HASHMAP -----------------------
         */
        Map<Integer, String> months = new HashMap<>();
        months.put(1, "December");
        months.put(2, "January");
        months.put(3, "February");
        months.put(4, "March");

        System.out.println(months);

        System.out.println("First month of the year is " + months.get(2));

        months.replace(3, "February", "May");
        System.out.println(months);

        months.remove(3);
        System.out.println(months);

        months.put (3, "February");
        System.out.println(months);

        months.forEach((key, value) -> System.out.println(key + " | " + value));

        /*
         -----------------CREATING String, String HASHMAP-----------------------
         */
        Map<String, String> fruitColors = new HashMap<String, String>();
        fruitColors.put("Apple", "red");
        fruitColors.put("Banana", "yellow");
        fruitColors.put("Kiwi", "green");
        fruitColors.put("Orange", "orange");
        fruitColors.put("Lime", "green");
        System.out.println(fruitColors);

        System.out.println(fruitColors.values());
        System.out.println(fruitColors.get("Banana"));
        System.out.println(fruitColors.keySet());

        fruitColors.replace("Apple", "yellow");
        System.out.println(fruitColors);

        fruitColors.remove("Lime");
        fruitColors.put("Pear", "Yellow");
        System.out.println(fruitColors);

        fruitColors.forEach((key, value) -> fruitColors.replace(key, value.toUpperCase()));

        System.out.println(fruitColors);

        /*
         -----------------CREATING Class, Class HASHMAP-----------------------
         */
        Map<Fruits, Colors> favFruits = new HashMap<>();
        Fruits fruit1 = new Fruits(FruitTypes.CHERRY);
        Fruits fruit2 = new Fruits(FruitTypes.FIG);
        Fruits fruit3 = new Fruits(FruitTypes.PEAR);
        Fruits fruit4 = new Fruits(FruitTypes.LEMON);

        Colors color1 = new Colors(ColorChoice.RED);
        Colors color2 = new Colors(ColorChoice.GREEN);
        Colors color3 = new Colors(ColorChoice.PURPLE);
        Colors color4 = new Colors(ColorChoice.YELLOW);

        favFruits.put(fruit1, color1);
        favFruits.put(fruit2, color2);
        favFruits.put(fruit3, color3);
        favFruits.put(fruit4, color4);

        favFruits.forEach((key, value) -> System.out.println(key.getName() + " : " + value.getName()));

        favFruits.replace(fruit2, color4);
        System.out.println(favFruits.get(fruit3).getName());

        favFruits.remove(fruit3);
        favFruits.forEach((key, value) -> System.out.println(key.getName() + " : " + value.getName()));





    }
}
