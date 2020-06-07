package hw16;

/*
Создайте 3 ArrayList - String, Integer и произвольного класса (придумайте сами)
добавьте в каждый ArrayList по 4 элемента
попробуйте методы add/set/remove/get/foreach
 */

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<String> listOfMoods = new ArrayList<>();
        listOfMoods.add("happy");
        listOfMoods.add("sad");
        listOfMoods.add("calm");
        listOfMoods.add("angry");
        listOfMoods.set(1, "gloomy");
        listOfMoods.set(3, "romantic");
        listOfMoods.remove(0);
        listOfMoods.get(2);
        for (String mood : listOfMoods) {
            System.out.println(mood);
        }

        ArrayList<Integer> listOfWinningNumbers = new ArrayList<>();
        listOfWinningNumbers.add(7);
        listOfWinningNumbers.add(5);
        listOfWinningNumbers.add(43);
        listOfWinningNumbers.add(31);
        listOfWinningNumbers.set(2, 74);
        listOfWinningNumbers.set(3, 62);
        listOfWinningNumbers.remove(3);
        listOfWinningNumbers.get(1);
        for (int number: listOfWinningNumbers) {
            System.out.println(number);
        }

        ArrayList<Bag> listOfBags = new ArrayList<>();
        Bag backpack = new Bag("blue", "cotton", 45, "backpack");
        Bag weekender = new Bag("green", "leather", 89, "weekender");
        Bag bucket = new Bag("brown", "leather", 59, "bucket");
        Bag clutch = new Bag("white", "silk", 49, "clutch");
        Bag shopper = new Bag("grey", "linen", 35, "shopper");
        listOfBags.add(backpack);
        listOfBags.add(weekender);
        listOfBags.add(bucket);
        listOfBags.add(clutch);
        listOfBags.set(1, shopper);
        listOfBags.remove(2);
        listOfBags.get(0);
        for (Bag bag: listOfBags) {
            System.out.println(bag.getColor());
        }
    }
}
