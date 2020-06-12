package homework_17;

import homework12.Nutrition_parameters;

import java.util.HashMap;
import java.util.Map;

//Создайте 3 HashMap- <String,String>, <Integer,String> и произвольного класса <Class1,Class2> (придумайте сами)
//добавьте в каждый HashMap по 4 элемента
//попробуйте методы put/replace/remove/get/foreach
public class homework_17 {
    public static void main(String[] args) {
        //<String,String>
        HashMap<String,String> dogs = new HashMap<>();
        dogs.put("Shiba Inu", "Gandalf");
        dogs.put("Akita Inu", "Balto");
        dogs.put("Shih Tzu", "Toby");
        dogs.put("Cocker Spaniel", "Mia");

        dogs.replace("Cocker Spaniel", "Gina");
        System.out.println(dogs);

        for(Map.Entry<String,String> entry : dogs.entrySet()){
            System.out.println(entry.getKey() + " is "+entry.getValue());
        }

        /*dogs.forEach((k, v) -> {
            System.out.format("key: %s, value: %d%n", k, v);
        });
        */
        System.out.println(dogs.get("Akita Inu"));
        dogs.remove("Akita Inu");

        //<Integer,String>
        HashMap<String,Integer> cakes_calories =new HashMap<>();
        cakes_calories.put("Chocolate cake", 345);
        cakes_calories.put("Banana cake", 360);
        cakes_calories.put("Black forest", 335);
        cakes_calories.put("Sacher", 340);
        System.out.println(cakes_calories.get("Sacher"));
        cakes_calories.remove("Black forest", 335);
        cakes_calories.replace("Chocolate cake", 345,340);
        for(Map.Entry<String,Integer> entry : cakes_calories.entrySet()){
            System.out.println(entry.getKey() + " has "+entry.getValue()+ " kcalories per 100 g");
        }

        //<Class1,Class2>
        HashMap<Nutrition_parameters,Double> black_forest_nutrition_parameters = new HashMap<>();
        black_forest_nutrition_parameters.put(Nutrition_parameters.SERVING_SIZE,100.00);
        black_forest_nutrition_parameters.put(Nutrition_parameters.CALORIES,335.00);
        black_forest_nutrition_parameters.put(Nutrition_parameters.FAT,15.6);
        black_forest_nutrition_parameters.put(Nutrition_parameters.CARBS,47.8);
        black_forest_nutrition_parameters.put(Nutrition_parameters.PROTEIN,4.1);
        black_forest_nutrition_parameters.remove(Nutrition_parameters.SERVING_SIZE);
        System.out.println("Nutrition parameters of Black Forest cake per 100 g:");
        for(Map.Entry<Nutrition_parameters,Double> entry : black_forest_nutrition_parameters.entrySet()){
            System.out.println(entry.getKey() + " = "+entry.getValue()+ " g");
        }
    }
}
