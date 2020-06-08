package hw16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        Создайте 3 ArrayList - String, Integer и произвольного класса (придумайте сами)
//добавьте в каждый ArrayList по 4 элемента
//попробуйте методы add/set/remove/get/foreach

        List<Dog> dogNames = new ArrayList<Dog>();
        Dog teddy = new Dog("Teddy", "Toy Poodle", 1);
        Dog zoe = new Dog("Zoe", "Shibainu", 2);
        Dog tosha = new Dog("Tosha","Unknown", 7);
        Dog jina = new Dog("Jina", "Shitsu", 3);
        Dog lusi = new Dog("Lusi", "Pug", 2);

        dogNames.add(teddy);
        dogNames.add(zoe);
        dogNames.add(tosha);
        dogNames.add(jina);
        dogNames.add(lusi);
        dogNames.set(0, lusi);

        Dog sharik = new Dog("Sharik", "Australian Shephard", 2);
        dogNames.add(sharik);
        System.out.println(dogNames.get(3).info());
        for (Dog nicknames : dogNames) {
            System.out.println(nicknames.info());
        }

//        ----------------------------------------------------
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(0);
        integerArrayList.add(10);
        integerArrayList.add(20);
        integerArrayList.add(30);
        integerArrayList.add(40);
        integerArrayList.add(50);
        integerArrayList.add(60);
        integerArrayList.add(70);

        integerArrayList.set(0,5);
        integerArrayList.set(5,99);

        System.out.println(integerArrayList);
        Collections.sort(integerArrayList);
        System.out.println(integerArrayList);

        integerArrayList.remove(2);
        integerArrayList.remove(5);
        System.out.println(integerArrayList);
        System.out.println(integerArrayList.get(3));

        for (Integer s :integerArrayList) System.out.println(s);

//        -------------------------------------------------------

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Car");
        stringArrayList.add("Boat");
        stringArrayList.add("Jetski");
        stringArrayList.add("ATV");
        stringArrayList.add("Bike");
        stringArrayList.add("Scooter");
        System.out.println(stringArrayList);

        stringArrayList.set(0, "Tank");
        System.out.println(stringArrayList);

        stringArrayList.remove(3);
        System.out.println(stringArrayList);

        stringArrayList.add(2, "Baloon");
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.get(2));
        for (String e : stringArrayList){
            System.out.println("My lovely equipment: " + e);
        }















    }
}
