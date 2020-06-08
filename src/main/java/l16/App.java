package l16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int xx = 5;
        char vv = 'f';
        boolean bb = true;
        double ss = 3.56;

        String st = "Some String";

        Integer xx1 = 5;
        Integer xx2 = new Integer(5);

        Character vv1 = 'r';
        Character vv2 = 'F';

        Boolean bb1 = false;
        Boolean bb2 = true;

        Double ss1 = 5.689;
        Double ss2 = 6.321;

        Integer[] vvv = {5, 6, 5, 6};

        ArrayList<String> list = new ArrayList<String>();

        // add(xxx) - add values to arraylist
        // size() - size of arraylist
        // get(index) - returns element of arraylist
        // set(index, element) - replace element in arraylist

        list.add("Color");
        System.out.println(list.size());

        list.add("Weather");
        System.out.println(list.size());

        System.out.println(list);
        list.add("Toy");
        list.add("Soap");
        list.add("Space");

        System.out.println(list);

        System.out.println(list.get(3));

        list.set(3, "Shampoo");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.add("School");
        list.add("Bus");
        list.add("Weather");
        System.out.println(list);

        list.remove("Weather");
        System.out.println(list);

        list.add("Shampoo");
        ArrayList<String> listToDelete = new ArrayList<String>(Arrays.asList("Shampoo", "Space"));
        list.removeAll(listToDelete);
        System.out.println(list);

        boolean isExist = list.contains("Color1");
        System.out.println(isExist);

        list.addAll(1, listToDelete);
        System.out.println(list);

//        list.forEach(x -> System.out.println(x));

        List<String> sublist = list.subList(2, 5);
        System.out.println(sublist);

        ArrayList<Integer> list_integers = new ArrayList<Integer>();

        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Black");
        System.out.println(colors);

//        List<Person> people = new ArrayList<Person>();
//        Person anna = new Person("Anna", "Smith");
//        people.add(anna);

//        for (String v:colors){
//            System.out.println(v);
//        }

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

    }
}

