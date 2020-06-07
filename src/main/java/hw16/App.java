package hw16;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<String> listOfMoods = new ArrayList<>();
        listOfMoods.add("happy");
        listOfMoods.add("sad");
        listOfMoods.add("calm");
        listOfMoods.add("angry");
        for (String str: listOfMoods
             ) {
            System.out.println(str);
        }
        System.out.println("/////////////***************///////////");

        listOfMoods.set(1, "gloomy");
        listOfMoods.set(3, "romantic");
        listOfMoods.remove(0);
        listOfMoods.get(2);

        for (String mood : listOfMoods) {
            System.out.println(mood);
        }

        ArrayList<Integer> listOfWinningNumbers = new ArrayList<>();
        listOfWinningNumbers.add(7);
        listOfWinningNumbers.add(8);
        listOfWinningNumbers.add(0,9);
        listOfWinningNumbers.add(10);
        listOfWinningNumbers.set(2, 77);
        listOfWinningNumbers.set(3, 67);
        listOfWinningNumbers.remove(0);
        listOfWinningNumbers.get(0);
        for (int number: listOfWinningNumbers) {
            System.out.println(number);
        }

        ArrayList<Car> listOfBags = new ArrayList<>();
        Car audio = new Car("Audio", "X9", "2 places car", 800000);
        Car mersedess = new Car("Mersedes", "gt8", "3 places car", 70000);
        Car toyota = new Car("Toyta", "ls7", "bkb", 10000);
        Car lambargini = new Car("lambargine", "bakuno90", "4 placcs car", 30000);
        Car baubtick = new Car("babutik", "bz77", "6 places car", 20000);
        listOfBags.add(audio);
        listOfBags.add(mersedess);
        listOfBags.add(toyota);
        listOfBags.add(3,lambargini);
        System.out.println("*****************");
        for (Car c: listOfBags
             ) {
            System.out.println(c.getType()+" " + c.getCar()+" "+ c.getFabric());
        }
        System.out.println("********************");

        listOfBags.set(1, baubtick);
        listOfBags.remove(2);

        for (Car c: listOfBags
        ) {
            System.out.println(c.getType()+" " + c.getCar()+" "+ c.getFabric());
        }

        listOfBags.get(0);
        for (Car car: listOfBags) {
            System.out.println(car.getType());
        }
    }
}
