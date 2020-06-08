package hw17;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        HashMap<String, String> employees = new HashMap<String, String>();
        employees.put("Ivanov", "developer");
        employees.put("Krasnov", "engineer");
        employees.put("Smirnov", "designer");
        employees.put("Zaharov", "developer");
        employees.put("Panov", "QA tester");

        System.out.println(employees);
        System.out.println(employees.get("Smirnov"));

        HashMap<Integer, String> guests = new HashMap<Integer, String>();
        guests.put(0, "Abramov");
        guests.put(5, "Zadov");
        guests.put(2, "Durov");
        guests.put(3, "Bukin");
        guests.put(1, "Popov");
        guests.put(4, "Rudova");

        guests.replace(3,"Kokorin");
        System.out.println(guests.get(3));
        guests.remove(0);
        guests.remove(4,"Rudova");

        for (Map.Entry<String, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for (String v: employees.values()){
            System.out.println(v);
        }
        for (String k: employees.keySet()){
            System.out.println(k);
        }

        Map<City, Supermarkets> iowa = new HashMap<>();
        iowa.put(new City("IA", "Iowa City"), new Supermarkets("Target", 2500));
        iowa.put(new City("IA", "Des Moines"), new Supermarkets("Aldi", 1500));
        iowa.put(new City("IA", "Waterloo"), new Supermarkets("Hy-Vee", 2300));
        iowa.put(new City("IA", "Iowa City"), new Supermarkets("Wallmart", 2500));
        iowa.put(new City("IA", "Madrid"), new Supermarkets("Target", 2500));

        System.out.println(iowa);

        for (Map.Entry<City, Supermarkets> entry : iowa.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for (Supermarkets s : iowa.values()) {
            System.out.println(s);
        }
        for (City c: iowa.keySet() ){
            System.out.println(c);
        }


    }
}
