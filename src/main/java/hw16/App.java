package hw16;

import java.util.*;


public class App {
    public static void main(String[] args) {
        List<String> tea = new ArrayList<String>();
        List<Integer> caffeine = new ArrayList<Integer>();
        List<Double> time = new ArrayList<Double>();

        tea.add("Black");
        tea.add("Green");
        tea.add("White");
        tea.add("Herbal");

        tea.set(2,"Red");
        System.out.println("Tea = " + tea);

        caffeine.add(60);
        caffeine.add(15);
        caffeine.add(10);
        caffeine.add(0);
        caffeine.add(2445);

        caffeine.remove(4);
        System.out.println("Caffeine content = " + caffeine);

        time.add(4.5);
        time.add((double) 3);
        time.add((double) 2);
        time.add(8.5);

        System.out.println("Steeping time for " + tea.get(0) + " is " + time.get(0) + " minutes");

        time.forEach(x->System.out.println(x));

    }
}
