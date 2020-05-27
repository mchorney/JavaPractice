package lesson10;

public class Lesson10 {

    public static void main(String[] arr) {

// создаем переменную класса Person

        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Ivanova";
        anna.year_of_birth = 1999;

//        Person kirill = new Person();
//        kirill=jack;
//        System.out.println(kirill.lastName);

        anna.printMe();

        System.out.println(anna.name);
        System.out.println(anna.lastName);
        System.out.println(anna.year_of_birth);

        Person peter = new Person();
        peter.name = "Peter";
        peter.lastName = "Petrov";
        peter.year_of_birth = 1998;

        Person jack = new Person();
        jack.name = "Jack";
        jack.lastName = "Daniels";
        jack.year_of_birth = 1989;

        jack.hello("Kate");

        Car mazda6 = new Car();

        mazda6.brand = "Mazda";
        mazda6.color = "silver";
        mazda6.year = 2015;
        mazda6.model = "6";

        mazda6.carStarted();
        mazda6.honk();
        mazda6.breaks();
        mazda6.carStarted();

        Car toyota_sienna = new Car();
        toyota_sienna.brand = "Toyota";
        toyota_sienna.year = 2015;
        toyota_sienna.color = "grey";
        toyota_sienna.model = "Sienna";

        toyota_sienna.carStarted();
        toyota_sienna.breaks();

        Fruit apple = new Fruit();
        apple.breed = "Apple Granny Smith";
        apple.color = "Green";

        Fruit maraquija = new Fruit();
        maraquija.color = "Crimson Light";
        maraquija.breed = "Maraquija";
    }
}
