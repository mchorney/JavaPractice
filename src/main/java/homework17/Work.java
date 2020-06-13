package homework17;

import java.util.HashMap;

public class Work {
    public static void main(String[] args) {

        HashMap<String,String> cars = new HashMap<>();
        cars.put("Germany","Mercedes");
        cars.put("USA","Ford");
        cars.put("Japan","Toyota");
        cars.put("Japan","Honda");
        cars.put("Russia","Mercedes");

        HashMap<String,Integer> salary = new HashMap<>();
        salary.put("Petrov",100000);
        salary.put("Ivanov",110000);
        salary.put("Sidorov",85000);

        HashMap<City,Hotel> rst = new HashMap<>();
        rst.put(new City("Miami"),new Hotel("Ritz"));
        rst.put(new City("Cancun"),new Hotel("Hilton"));
        rst.put(new City("Cancun"),new Hotel("Marriot"));

        System.out.println(salary.get("Ivanov"));
        for (String v: cars.values()) {
            System.out.println(v);
        }

        cars.remove("Russia","Mercedes");
        System.out.println(cars);

        salary.replace("Sidorov",85000,100000);
        System.out.println(salary);

    }
}
