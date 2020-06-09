package homework16;

import homework11.Dress;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {

        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Aster");
        flowers.add("Daisy");
        flowers.add("Irises");
        flowers.add("Peony");
        flowers.add("Lavender");
        flowers.add("Anemone");

        System.out.println("This is size of the ArrayList flowers: " + flowers.size());
        System.out.println("This is the returning element from the flowers according to the index: " + flowers.get(2));
        System.out.println("This is the removing the element from the flowers according to the index: " + flowers.remove(2));

        //1. ForEach
        for (String v : flowers) {
            System.out.println(v);
        }

        flowers.add("Irises");

        //2. Using for
        for (int i = 0; i < flowers.size(); i++) {
            System.out.println(flowers.get(i));
        }

        // 3. Lanmbda expression
        System.out.println("Lambda expression:");
        flowers.forEach(x -> System.out.println(x));

        // добавить элемент по индексу
        flowers.add(1, "Rose");
        for (String v : flowers) {
            System.out.println(v);
        }
        /*Sort statement*/

        Collections.sort(flowers);
        System.out.println("Sorted array:");
        flowers.forEach(x -> System.out.println(x));

        System.out.println(flowers.isEmpty());

        //set a value in arrayList - тоже по индексу
        System.out.println("Set a new value: Lily");
        flowers.set(6, "Lily");
        flowers.forEach(x -> System.out.println(x));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        numbers.forEach(x -> System.out.println(x));
        numbers.remove(1);
        System.out.println("Remove element with index 1: ");

        for (Integer v : numbers) {
            System.out.println(v);
        }
        System.out.println("Set element with index 1: ");
        numbers.set(1, 2);
        for (Integer v : numbers) {
            System.out.println(v);
        }
        System.out.println("Add element according to specific index: ");
        numbers.add(2, 3);
        for (Integer v : numbers) {
            System.out.println(v);
        }
        System.out.println("Size of numbers: ");
        System.out.println(numbers.size());

        System.out.println("Get element based on index: ");
        System.out.println(numbers.get(3));

        System.out.println("Remove element based on index: ");
        System.out.println(numbers.remove(5));

        System.out.println("Numbers after removing of index 5: ");
        for (Integer v : numbers) {
            System.out.println(v);
        }

        ArrayList<Dress> dresses = new ArrayList<>();

        dresses.add(new Dress(46, "White", 1000, "Casual", "Long", "V-Neck"));
        dresses.add(new Dress(48, "Red", 500));
        dresses.add(new Dress(48, "Blue", 350, "Party", "Short"));
        dresses.add(new Dress(38, "Black", 1500));

        System.out.println("All elements: ");
        dresses.forEach(x -> System.out.println(x));

        dresses.remove(3);
        System.out.println("Remove element with index 3");
        dresses.forEach(x -> System.out.println(x));

        System.out.println("Replace one element to another: ");
        dresses.set(1, new Dress(42, "Red"));
        dresses.forEach(x -> System.out.println(x));
    }
}
