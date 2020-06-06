package hw16;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Work {
    public static void main(String[] args) {
//        Integer xx1 = 5;
//        Integer xx2 = new Integer(5);
//        Character vv1 = 'r';
//        Boolean bb1 = false;
//        Character vv2 = 'F';
//        Boolean bb2 = true;
//        Double ss1 = 5.689;
//        Double ss2 = 6.321;
//        Integer[] vvv = {1,5,4,5};
//        ArrayList<String> list = new ArrayList<String>();
//        String[]  s = {"ss","sdsd"};
//        list.add("Color");
//        System.out.println(list);
//        System.out.println(list.size());
//        list.add("Weather");
//        System.out.println(list);
//        System.out.println(list.size());
//        list.add("Soap");list.add("Space");list.add("Toy");
//        System.out.println(list);
//        System.out.println(list.get(3));
//        //list.set(3,"Space23");//exchange
//        System.out.println(list);
//        //list.remove(3);
//        System.out.println(list);
//        list.add("Soap");
//        //list.remove("Soap");
//        System.out.println(list);
//        //list.removeAll(new ArrayList<String>(Collections.singleton("Soap")));
//        System.out.println(list.contains("Color"));
//        System.out.println(list);
//        list.forEach(x -> System.out.println(x));//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//
//        List<String> sublist = list.subList(2,5);
//        System.out.println(sublist);
//        //String[] array = (String[]) list.toArray();??????????????????????????????????????
//        ArrayList<Integer> list_integer = new ArrayList<>();
//
//        //interface              class
//        List<String> colors = new ArrayList<String>();
//        colors.add("Red");
//        colors.add("Blue");
//        colors.add("Pink");
//        colors.add("Blue");
//        colors.add("Black");
//        System.out.println(colors);
//
//
        List<Drinks> drinks = new ArrayList<Drinks>();
        Drinks beer = new Drinks("Beer", 500);
        Drinks coffee = new Drinks("Coffee", 150);
        Drinks latte = new Drinks("Latte", 250);
        Drinks tea = new Drinks("Tea", 300);
        drinks.add(beer);
        drinks.add(coffee);
        drinks.add(latte);
        drinks.add(tea);
        Drinks coctail = new Drinks("Coctail", 500);
        drinks.add(coctail);

        //list.forEach(x -> System.out.println(x));
        drinks.forEach(x -> System.out.println(x.type + " size: " + x.size + "ml"));
        System.out.println("-");
        drinks.remove(beer);
        Drinks latteMilk = new Drinks("Latte-milk", 350);
        drinks.add(latteMilk);
        drinks.forEach(x -> System.out.println(x.type + " size: " + x.size + "ml"));
        System.out.println("-");
        drinks.set(2,beer);
        drinks.forEach(x -> System.out.println(x.type + " size: " + x.size + "ml"));
        System.out.println("-");System.out.println("-");System.out.println("-");
//-----------------------------------------------------------------------------------------
        ArrayList<String> list = new ArrayList<String>();

        list.add("Coffee");list.add("Milk");list.add("Water");list.add("Tea");
        list.add("Latte");list.add("Water");
        list.forEach(x -> System.out.println(x));
        System.out.println("-");
        list.add("Soda");list.add("Water");
        list.forEach(x -> System.out.println(x));
        System.out.println("-");
        list.removeAll(Collections.singleton("Water"));
        list.forEach(x -> System.out.println(x));
        System.out.println("-");System.out.println("-");System.out.println("-");

//-----------------------------------------------------------------------------------------
        ArrayList<Integer> listInt = new ArrayList<Integer>();
        listInt.add(1);listInt.add(2);listInt.add(3);listInt.add(4);
        listInt.add(5);listInt.add(6);listInt.add(7);listInt.add(8);
        listInt.forEach(x -> System.out.println(x));
        System.out.println("-");
        //lets double it:
        listInt.forEach(x -> listInt.set(x-1,listInt.get(x-1) + listInt.get(x-1)));
        listInt.forEach(x -> System.out.println(x));


    }
}
