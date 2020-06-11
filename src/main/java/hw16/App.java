package hw16;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Cars> car = new ArrayList<Cars>();
        Cars VOLVO = new Cars("VOLVO", 2018);
        Cars MAZDA = new Cars("MAZDA", 2016);
        Cars TESLA = new Cars("TESLA", 2020);
        Cars BMW = new Cars("BMW", 2020);

        car.add(VOLVO);
        car.add(MAZDA);
        car.add(TESLA);
        car.add(BMW);


        System.out.println(car.size());
        System.out.println(car);
        System.out.println(car.get(3));

        car.set(0, VOLVO);
        System.out.println(car);

        car.remove(0);
        System.out.println(car);

        for (Cars i : car){
            System.out.println(i);
        }

        List<String> list = new ArrayList<>();

        list.add("hammer");
        list.add("balloon");
        list.add("circus");
        list.add("clown");

        System.out.println(list);

        list.add("horse");
        list.get(1);
        System.out.println(list);

        list.set(1, "horse");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        for (String hammer : list) {
            System.out.println(hammer);
        }
        List<Integer> list1 = new ArrayList<>();

        list1.add(1917);
        list1.add(1948);
        list1.add(1990);
        list1.add(2000);

        list1.get(1);
        System.out.println();

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        list1.remove(3);
        System.out.println(list1);

        list1.set(0, 585);
        System.out.println(list1);


    }
}
