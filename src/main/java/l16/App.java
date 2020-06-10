package l16;

import java.util.ArrayList;
import java.util.Collections;


public class App {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Dog");
        stringArrayList.add("Cat");
        stringArrayList.add("Parakeet");
        stringArrayList.add("Snake");
        stringArrayList.add("Lizard");
        System.out.println(stringArrayList);
        stringArrayList.set(1, "Turtle");
        System.out.println(stringArrayList);
        stringArrayList.add(1, "Cat");
        System.out.println(stringArrayList);
        stringArrayList.add("Bobcat");
        System.out.println(stringArrayList);
        stringArrayList.remove("Bobcat");
        stringArrayList.remove("Dog");
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.get(0));
        System.out.println(stringArrayList.get(4));
        for (String i: stringArrayList) {
            System.out.println("Your favorite animal is " + i);
        }

        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(0);
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.add(4);
        intArrayList.add(5);
        intArrayList.add(6);
        intArrayList.add(7);
        intArrayList.add(8);
        intArrayList.add(9);
        intArrayList.add(10);
        intArrayList.set(2, 8);
        intArrayList.set(4, 6);
        intArrayList.set(6, 4);
        intArrayList.set(8, 2);
        System.out.println(intArrayList);
        Collections.sort(intArrayList);
        System.out.println(intArrayList);
        intArrayList.remove(2);
        intArrayList.remove(9);
        intArrayList.remove(7);
        System.out.println(intArrayList);
        System.out.println(intArrayList.get(2));
        System.out.println(intArrayList.get(6));
        System.out.println(intArrayList.get(7));
        for (Integer i : intArrayList) System.out.println(i);

        FamousPeople first = new FamousPeople("Simo", "Häyhä", 115, "Finnish military sniper");
        FamousPeople second = new FamousPeople("Tiger", "Woods", 44, "American professional golfer");
        FamousPeople third = new FamousPeople("Bruce", "Willis", 65, "American actor, producer, and singer");
        FamousPeople forth = new FamousPeople("Andy", "Warhol", 92, "American artist, film director, and producer");
        FamousPeople fifth = new FamousPeople("Pablo", "Picasso", 139, "Spanish painter, sculptor, printmaker, ceramicist and theatre designer");
        ArrayList<FamousPeople> people = new ArrayList<>();
        people.add(first);
        people.add(second);
        people.add(forth);
        people.add(2, third);
        people.set(0, fifth);
        people.set(1, forth);
        System.out.println(people.get(2).info());
        for (FamousPeople persona : people) {
            System.out.println(persona.info());
        }
    }
}
