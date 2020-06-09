package hwLesson17;

import java.util.HashMap;
import java.util.Map;

//Создайте 3 HashMap- <String,String>, <Integer,String> и произвольного класса <Class1,Class2> (придумайте сами)
//        добавьте в каждый HashMap по 4 элемента
//        попробуйте методы put/replace/remove/get/foreach
//        Shared in
public class App {
    public static void main(String[] args) {

        //HashMap <String, String>
        HashMap<Integer,String> weekDays = new HashMap<>();
        weekDays.put(1,"Monday");
        weekDays.put(2,"Tuesday");
        weekDays.put(3,"Wednesday");
        weekDays.put(4,"Thursday");
        weekDays.put(5,"Saturday");
        System.out.println(weekDays);
        weekDays.remove(5);
        System.out.println(weekDays);
        weekDays.put(5,"Friday");
        System.out.println("Printing the Value of the 1st Key is : "+ weekDays.get(1));

        //HashMap <String, String>
        HashMap<String,String> colorsMap = new HashMap<>();
        colorsMap.put("FF0000","Red");
        colorsMap.put("FFA500","Orange");
        colorsMap.put("FFFF00","Yellow");
        colorsMap.put("808000","Olive");
        System.out.println("This is the Second HAsh Map");
        for (Map.Entry<String,String> k:colorsMap.entrySet()){
            System.out.println(k);
        }

        ////HashMap <Person, Car>

        Person firstClient =new Person("James","Smith",12345);
        Person secondClient = new Person("Tina","Turner",54234);
        Person thirdClient = new Person("Ronald","Chou",98762);
        Person forthClient = new Person("Mary","Zillinger",32234);

        Car firstCar = new Car("A150","15000");
        Car secondCar = new Car("B250", "20000");
        Car thirdCar = new Car("C350", "30000");
        Car forthCar = new Car("E550", "60000");

        HashMap<Person,Car> clientPurchased = new HashMap<>();
        clientPurchased.put(firstClient,firstCar);
        clientPurchased.put(secondClient,secondCar);
        clientPurchased.put(thirdClient,thirdCar);
        System.out.println("Print the Value of the first Key of type \"Car\"");
        clientPurchased.get(firstClient).printOut();
        for (Map.Entry<Person,Car>  k: clientPurchased.entrySet()){
            System.out.println("Key");
            k.getKey().printOut();
            System.out.println("Value");
            k.getValue().printOut();
            System.out.println("------");

        }


}
}