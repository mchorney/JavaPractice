package homework17;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        Map<String,String> flowers=new HashMap<>();
        flowers.put("rose", "red");
        flowers.put("tulip", "yellow");
        flowers.put("lily","pink");
        flowers.put("chamomile","white");
        System.out.println(flowers);
        flowers.replace("tulip","red");
        for (String v:flowers.values()) {
            System.out.println(v);
        }
        flowers.remove("lily");
        System.out.println(flowers.get("chamomile"));

        Map<Integer,String> drinks=new HashMap<>();
        drinks.put(1,"water");
        drinks.put(2,"tea");
        drinks.put(3, "coffe");
        drinks.put(4,"soda");
        System.out.println(drinks);
        drinks.remove(2,"tea");
        System.out.println(drinks);
        System.out.println(drinks.get(3));

        Map<Address,PhoneNumbers> employees=new HashMap<>();
        employees.put(new Address("Plano", "2216 Opal Ln"), new PhoneNumbers("Mary Jhons", 465987232));
        employees.put(new Address("Richardson","4536 Arapaho Str"), new PhoneNumbers("Bill Borozny", 456852951));
        employees.put(new Address("Dallas","8734 Ohio Str"), new PhoneNumbers("Jacy Star", 854691335));
        employees.put(new Address("Garland", "678 K Ave"), new PhoneNumbers("Vlad Black", 245368259));

        for (Address dd:employees.keySet()) {
            System.out.println(dd.getStreetAddress());
        }
            for(Address dd1:employees.keySet()){
                dd1.stAd();
            }

        for (PhoneNumbers ad:employees.values()) {
            ad.phone();
        }

//        employees.forEach((p,j) -> System.out.println(p.stAd() + j.phone()));

            for (Map.Entry<Address, PhoneNumbers> entry : employees.entrySet()) {
                System.out.println(entry.getKey() + "  " + entry.getValue());


            }


    }
}
