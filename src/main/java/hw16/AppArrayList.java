package hw16;

import hw14.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AppArrayList {
    public static void main(String[] args) {

        //String List

        List<String> stringList = new ArrayList<>(Arrays.asList("Fog", "Drizzle", "Rain", "Ice Pellets", "Hail"));
        stringList.add("Snow");
        stringList.add(2, "Small Hail");
        stringList.add("Radiation Fog");
        stringList.add("Advection Fog");
        System.out.println(stringList);

        stringList.set(2, "Ice Crystals");
        System.out.println(stringList);

        stringList.remove(2);
        System.out.println(stringList);

        System.out.println(stringList.get(0));

        stringList.forEach(System.out::println);

        for (String s : stringList) System.out.print(s + " ");



        // Integer List

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,6,8,79,5,1,5,59));
        integerList.add(8);
        integerList.add(0, 100);
        integerList.add(5, 100);
        integerList.add(12);
        System.out.println(integerList);

        integerList.set(0, 1000);
        System.out.println(integerList);

        integerList.remove(5);
        System.out.println(integerList);

        System.out.println(integerList.get(7));

        integerList.forEach(System.out::println);

        Iterator<Integer> iterator1 = integerList.iterator();
        while (iterator1.hasNext())
            System.out.println(iterator1.next() + " ");



        //Object List

        Vehicle veh1 = new Car(4, true, Brand.MERCEDES, 5, "Sedan", "Motor");
        Vehicle veh2 = new Plane(8, false, Brand.CHRYSLER, "Jet", 6);
        Vehicle veh3 = new Bicycle(3, false, Brand.TOYOTA, 0, "Mount Bike", "Legs", 1, "Metal");
        Vehicle veh4 = new Car(4, true, Brand.TOYOTA, 5, "Sedan", "Motor");
        Vehicle veh5 = new Plane(12, false, Brand.HONDA, "Jet", 12);
        Vehicle veh6 = new Bicycle(2, false, Brand.CHRYSLER, 0, "Mount Bike", "Legs", 1, "Metal");
        List<Vehicle> vehicle  = new ArrayList<>();
        vehicle.add(veh1);
        vehicle.add(veh2);
        vehicle.add(veh3);
        vehicle.add(veh4);

        vehicle.set(3, veh5);

        vehicle.remove(2);

        System.out.println(vehicle.get(0));
        vehicle.get(0).printOut();

        vehicle.forEach(System.out::println);

    }
}
