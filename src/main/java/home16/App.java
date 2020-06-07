package home16;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Chocolate Cake");
        list.add("Musse Cake");
        list.add("Chiscake");
        list.add("Tiramisy");
        System.out.println(list);
        list.set(1,"Three Chocolate");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.get(2);
        System.out.println(list);
        list.forEach(System.out::println);



        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(22);
        list1.add(33);
        list1.add(44);
        list1.add(55);
        System.out.println(list1);
        list1.set(0,66);
        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1);
        list1.get(1);
        System.out.println(list1);
        list1.forEach(x-> System.out.println(x));



        ArrayList<Dog> dog=new ArrayList<Dog>();
        Dog jack=new Dog("Jack Russell Terrier","spotty",2);
        Dog shepherd=new Dog("Shepherd","redhead",4);
        Dog poodle=new Dog("Poodle","black",3);
        Dog shihtzu=new Dog("Shih Tzu","beige",5);
        dog.add(jack);
        dog.add(shepherd);
        dog.add(poodle);
        dog.add(shihtzu);
        System.out.println(dog);
        dog.forEach(x-> System.out.println(x));
        Dog pug=new Dog("Pug","grey",1);
        dog.set(3,pug);
        System.out.println(dog);
        dog.get(0);
        System.out.println(dog);




    }
}
