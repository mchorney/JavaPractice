package lesson11;

import homework11.Dress;
import homework11.Forest;
import homework11.Person;


public class App {
    public static void main(String[] args) {

        Dress dress1 = new Dress(46, "White", 1000, "Casual", "Long", "V-Neck");
        dress1.printClass();
        dress1.setColor("Blue");
        dress1.printClass();
        Dress dress2 = new Dress(48, "Red", 500);
        dress2.printClass();
        Dress dress3 = new Dress();
        dress3.printClass();

        Forest forest1 = new Forest(150000, 30000000, "Pacific NorthWest", 50000000.345);
        forest1.printClass();
        forest1.setArea(50000000);
        forest1.setLocation("Arizona");
        forest1.printClass();
        Forest forest2 = new Forest("California,", 3466777787.98);
        forest2.printClass();
        Forest forest3 = new Forest();
        forest3.printClass();

        String []array_pets = {"dog", "cat"};
        Person peter = new Person("Petr", "Petrov", 24, array_pets);
        peter.printClass();
        peter.setAge(77);
        peter.setName("Alan");
        peter.printClass();
        peter.setAge(170);
        peter.printClass();

        String[] array_pets1 = {"Cat", "Puppy", "Ara Parrot", "Aquarium fish"};
        Person maria = new Person("Maria", "Petrova", 23, array_pets1);
        String[] pets = maria.getPersons_pets();
        for (String v : pets){
            System.out.println(v);
        }

        Person andrew = new Person("Sidorov");
        andrew.printClass();

        Person masha = new Person();
        masha.printClass();
    }
}



