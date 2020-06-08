package hw16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {


        ArrayList<String> furniture = new ArrayList<>();
        furniture.add("Chair");
        furniture.add("Sofa");
        furniture.add("desk");
        furniture.add("wardrobe");
        furniture.add("bed");
        furniture.add("nightstand");
        furniture.add("armchair");
        furniture.add("table");

        System.out.println(furniture.get(6));
        System.out.println(furniture.get(3));
        System.out.println(furniture.get(0));

        System.out.println(furniture.set(2, "ottoman"));
        System.out.println(furniture.set(0, "sofa"));
        System.out.println(furniture.set(5, "chair"));
        System.out.println(furniture.set(0, "chair"));

        furniture.remove(5);
        furniture.remove("desk");

        furniture.forEach(x -> System.out.println(x));
        furniture.forEach(c -> System.out.println(c));


        System.out.println(furniture.subList(1, 5));

        System.out.println(furniture.size());
        System.out.println(furniture);



        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(4);
        numbers.add(-35);
        numbers.add(486);
        numbers.add(100);

        System.out.println(numbers);
        System.out.println(numbers.size());

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));


            System.out.println(numbers.get(3));
            System.out.println(numbers.get(0));

            System.out.println(numbers.set(2, 333));
            System.out.println(numbers.set(5, 111));

            numbers.remove(1);
            numbers.remove(4);

            numbers.forEach(b -> System.out.println(b));

            System.out.println(numbers);



            List<House> houseSell = new ArrayList<House>();
            House downtown = new House("Downtown", 1998);
            House east = new House("East_side", 2018);
            House west = new House("West_side", 2000);
            House village = new House("subburb", 1979);
            House south = new House("South", 2017);

            houseSell.add(downtown);
            houseSell.add(south);
            houseSell.add(village);
            houseSell.add(west);
            houseSell.add(east);

            west.setArea("west-west");
            west.printInfo();


            System.out.println(houseSell.get(3));

            houseSell.remove(2);


            houseSell.forEach((n) -> System.out.println(n));


            System.out.println(houseSell);
            System.out.println(houseSell.size());


        }
    }






        }






