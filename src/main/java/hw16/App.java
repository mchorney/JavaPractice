package hw16;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Blue");
        list.add("Green");
        list.add("Red");
        list.add("Yellow");
        System.out.println(list);
        list.set(1,"White");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.get(2);
        System.out.println(list);
        list.forEach(System.out::println);


        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(23);
        list1.add(34);
        list1.add(45);
        list1.add(56);
        System.out.println(list1);
        list1.set(0,67);
        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1);
        list1.get(1);
        System.out.println(list1);
        list1.forEach(x-> System.out.println(x));


        ArrayList<Cat> cat=new ArrayList<Cat>();
        Cat siamese=new Cat("Siamese","white",3);
        Cat abyssian=new Cat("Abyssian","yellow",5);
        Cat boombay=new Cat("Boombay","black",2);
        Cat fold=new Cat("Scottish Fold","grey",4);
        cat.add(siamese);
        cat.add(abyssian);
        cat.add(boombay);
        cat.add(fold);
        System.out.println(cat);
        cat.forEach(x-> System.out.println(x));
        Cat snowshoe=new Cat("Snowshoe","brown",1);
        cat.set(3,snowshoe);
        System.out.println(cat);
        cat.get(0);
        System.out.println(cat);




    }
}