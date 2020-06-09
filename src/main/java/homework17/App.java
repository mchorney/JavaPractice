package homework17;

import java.util.HashMap;
import java.util.Map;

import homework11.Dress;

public class App {
    public static void main(String[] args) {
        Map<String, String> currency = new HashMap<>();
        currency.put("USA", "USD");
        currency.put("Russia", "RUB");
        currency.put("Czech Republic", "CZK");
        currency.put("Hungary", "HUF");
        currency.put("Japan", "JPY");

        System.out.println(currency);
        System.out.println(currency.get("USA"));
        System.out.println("Removing USA and USD: ");
        currency.remove("USA");
        System.out.println(currency);
        System.out.println("Size of HashMap: " + currency.size());
        System.out.println("IsEmpty verification: " + currency.isEmpty());
        System.out.println("HashMap values: " + currency.values());

        System.out.println("Loop Through a HashMap");
        System.out.println("Print keys: ");

        for (String i : currency.keySet()) {
            System.out.println(i);
        }
        System.out.println("Print values: ");
        for (String i : currency.values()) {
            System.out.println(i);
        }
        System.out.println("Print keys and values: ");
        for (String i : currency.keySet()) {
            System.out.println("key: " + i + ", value: " + currency.get(i));
        }
        for (String i : currency.keySet()) {
            System.out.println(currency.get(i));
        }

        Map<Integer, String> scores = new HashMap<>();
        scores.put(60, "D");
        scores.put(70, "C");
        scores.put(85, "B");
        scores.put(95, "A");

        System.out.println(scores.size());
        System.out.println(scores.isEmpty());
        System.out.println(scores.values());
        System.out.println(scores.get(60));
        System.out.println(scores.keySet());
        System.out.println(scores.remove(60) + "\n" + scores);

        System.out.println("Итерация по ключам: ");
        for (Integer i : scores.keySet()) {
            System.out.println(i);
        }
        System.out.println(scores.getOrDefault(60, "D"));

        System.out.println("Print keys and values: ");
        for (Integer i : scores.keySet()) {
            System.out.println("key: " + i + ", value: " + scores.get(i));
        }

        System.out.println("Итерация по values: ");
        for (Integer i : scores.keySet()) {
            System.out.println(scores.get(i));
        }

        Map<Person, Dress> person_dress = new HashMap<>();
        Dress dress1 = new Dress(46, "White", 400, "Casual", "Long", "V-Neck");
        Dress dress2 = new Dress(43, "Black", 100, "Casual", "Long", "V-Neck");
        Dress dress3 = new Dress(38, "Blue", 150, "Long", "V-Neck");
        Dress dress4 = new Dress(44, "Green", 5000, "Casual", "V-Neck");

        Person Anna = new Person("Anna", "Smith", 35);
        Person Maria = new Person("Maria", "Olson", 35);
        Person Olga = new Person("Olga", "Johnson", 35);
        Person Irena = new Person("Irena", "Doolittle", 35);

        person_dress.put(Anna, dress1);
        person_dress.put(Maria, dress2);
        person_dress.put(Olga, dress3);
        person_dress.put(Irena, dress4);

        System.out.println(person_dress);
        System.out.println("All values: " + person_dress.values());
        System.out.println("All keys: " + person_dress.keySet());
        System.out.println("Size: " + person_dress.size());

        person_dress.remove(Anna);

        System.out.println("Remove an item: " + person_dress);
        System.out.println("Access a value: " + person_dress.get(Olga));

        System.out.println("Print keys and values: ");
        for (Person i : person_dress.keySet()) {
            System.out.println("key: " + i + ", value: " + person_dress.get(i));
        }
        System.out.println("Итерация по ключам: ");
        for (Person i : person_dress.keySet()) {
            System.out.println(i);
        }

        System.out.println("Итерация по values: ");
        for (Person i : person_dress.keySet()) {
            System.out.println(person_dress.get(i));
        }
    }
}
