package hw16;

//Создайте 3 ArrayList - String, Integer и произвольного класса (придумайте сами)
//        добавьте в каждый ArrayList по 4 элемента
//        попробуйте методы add/set/remove/get/foreach

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {


        ArrayList<String> carList = new ArrayList<>();

        carList.add("Ford");
        carList.add("Ram");
        carList.add("Dodge");
        carList.add("Chevy");
        carList.add("Lincoln");
        for (String cars : carList
        ) {
            System.out.println(cars);
        }

        System.out.println(carList.size());

        System.out.println(carList);

        System.out.println(carList.get(4));

        carList.set(4, "Cadillac");
        System.out.println(carList);

        carList.remove(2);
        System.out.println(carList);


        System.out.println(carList.get(2));

        carList.forEach(x -> System.out.println(x));
//        or carList.forEach(System.out::println);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(4);
        numbers.add(1, 5);
        System.out.println(numbers);
        numbers.add(17);
        numbers.set(0, 19);
        numbers.set(2, 123);

        int xx = numbers.get(2);
        System.out.println("element at index 2 is " + xx);

        numbers.remove(1);
        System.out.println(numbers);
        for (int yy : numbers) {
            System.out.println(yy);
        }

        ArrayList<Phone> PhonesForSale = new ArrayList<>();
        Phone iphone = new Phone("Iphone", "11X", "Silver", 1000);
        Phone samsung = new Phone("Samsung", "S20", "Black", 800);
        Phone motorola = new Phone("Motorola", "Moto5", "Gray", 400);
        Phone googlePhone = new Phone("Google", "Pixel4", "White", 999);
        PhonesForSale.add(iphone);
        PhonesForSale.add(samsung);
        PhonesForSale.add(motorola);

        for (Phone phone : PhonesForSale) {

            System.out.println(phone.getBrand() + ", " + phone.getPrice());

        }

        PhonesForSale.set(1, googlePhone);
        PhonesForSale.remove(0);
        PhonesForSale.add(2, googlePhone);


        for (Phone phone : PhonesForSale) {

            System.out.println(phone.getBrand() + ", " + phone.getPrice() + ", " + phone.getModel() + ", " + phone.getColor());

        }


    }

}

