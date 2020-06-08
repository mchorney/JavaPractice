package homework16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("January");
        list.add("May");
        list.add("July");
        list.add("August");
        System.out.println(list);
        list.set(1,"June");
        System.out.println(list);
        System.out.println(list.get(3));
        ArrayList<String> listToAdd = new ArrayList<String>(Arrays.asList("February", "March", "April", "May", "June"));
        list.addAll(1,listToAdd);
        list.remove("June");
        System.out.println(list);

        ArrayList<Integer> digits=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        digits.set(4,6);
        digits.add(4,5);
        digits.remove(5);
        System.out.println(digits);

        ArrayList<Character> letters=new ArrayList<Character>(Arrays.asList('a','b','c','d'));
        System.out.println(letters.get(0));
        letters.set(3,'e');
        letters.remove(3);
        System.out.println(letters);
        list.forEach(x-> System.out.println(x));
    }
}
