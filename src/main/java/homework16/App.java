package homework16;

import homework14.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("January");
        list.add("May");
        list.add("July");
        list.add("August");
        System.out.println(list);
        list.set(1, "June");
        System.out.println(list);
        System.out.println(list.get(3));
        List<String> listToAdd = new ArrayList<String>(Arrays.asList("February", "March", "April", "May", "June"));
        list.addAll(1, listToAdd);
        list.remove("June");
        System.out.println(list);

        List<Integer> digits = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        digits.set(4, 6);
        digits.add(4, 5);
        digits.remove(5);
        System.out.println(digits);

        List<Car> cars = new ArrayList<Car>();
        Car lexus = new Car("Lexus", "RX350L", Color.SILVER);
        Car honda = new Car("Honda", "Civic Si", Color.BLACK);
        Car volvo = new Car("Volvo", "VNL 780", Color.WHITE);
        Car mazda = new Car("Mazda", "SX5", Color.METALIC);
        cars.add(lexus);
        cars.add(honda);
        cars.add(volvo);
        cars.add(mazda);
        lexus.printme();
        honda.printme();
        volvo.printme();
        mazda.printme();

        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).printme();
        }
        for (Car c : cars) {
            System.out.println(c.getMake()+" " + c.getModel()+" " + c.getColor());
        }
    }
}
