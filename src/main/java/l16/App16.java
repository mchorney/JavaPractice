package l16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App16 {
    public static void main(String[] args) {
        Integer xx1 = 5;
        Character vv1 = 'r';
        Boolean bb1 = false;
        Double ss1 = 5.689;

        ArrayList<String> list = new ArrayList<String>();
        list.add("Color");
        System.out.println(list.size());
        list.add("Weather");
        list.add("Toy");
        list.add("Soap");
        list.add("Space");

//        System.out.println(list);
//        System.out.println(list.get(3));
//
//        list.set(3,"Shampoo");
//        System.out.println(list);
//
//        list.remove(2);
//        System.out.println(list);

        list.add("Weather");
        list.add("Irina");
        list.add("School");
        list.add("Star Wars");
        list.remove("Weather");

        ArrayList<String> listToDelete = new ArrayList<String>(Arrays.asList("Shampoo","Space"));
        list.removeAll(listToDelete);

        System.out.println(list);

        boolean isExist = list.contains("Color");
        System.out.println(isExist);

        list.addAll(listToDelete);
        System.out.println(list);

//        list.forEach(x-> System.out.println(x));

        List<String> sublist = list.subList(2,5);
        System.out.println(sublist);

        String[] array = (String[]) list.toArray();
    }
}
