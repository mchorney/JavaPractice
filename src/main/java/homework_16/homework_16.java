package homework_16;

import homework12.Units;

import java.util.ArrayList;
import java.util.Arrays;

//Создайте 3 ArrayList - String, Integer и произвольного класса (придумайте сами)
//добавьте в каждый ArrayList по 4 элемента
//попробуйте методы add/set/remove/get/foreach
public class homework_16 {
    public static void main(String[] args) {
        //String
        ArrayList<String> cakes = new ArrayList<>();
        cakes.add("Black forest");
        cakes.add("Sacher");
        cakes.add(1,"Irish cream");
        cakes.add(2, "Tiramisu");
        cakes.set(1,"Strawberry");
        cakes.add(4,"Napoleon");
        cakes.remove("Sacher");

        ArrayList<String> keto = new ArrayList<>(Arrays.asList("Vanilla cake", "Raspberry cake", "Chocolate cake"));
        cakes.addAll(2,keto);
        System.out.println(cakes);
        System.out.println(cakes.get(1));

        cakes.forEach(System.out::println);

        //Integer
        ArrayList<Integer> random_numbers = new ArrayList<>();
        random_numbers.add(45);
        random_numbers.add(0,345);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(123,456,78,90));
        random_numbers.addAll(1,numbers);
        System.out.println(random_numbers);
        random_numbers.forEach(System.out::println);

        //Units
        ArrayList<Units> units = new ArrayList<>();
        units.add(Units.OZ);
        units.add(1,Units.G);
        units.remove(0);
        ArrayList<Units> new_units = new ArrayList<>(Arrays.asList(Units.ML,Units.OZ));
        units.addAll(1,new_units);
        System.out.println(units);
        System.out.println(units.get(0));
    }
}
