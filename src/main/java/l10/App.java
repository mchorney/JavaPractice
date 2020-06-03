package l10;

<<<<<<< HEAD
import hm10.Animal;
import hm10.Cities;
import hm10.Device;
import hm10.Food;

public class App {
    public static void main(String[] args) {
        Animal cindy = new Animal();
        cindy.kind = "Cat";
        cindy.name = "Cindy";
        cindy.color = "Gray";
        cindy.breed = "Siamese";

        cindy.printMe();
        cindy.hello2();


        Animal chack = new Animal();
        chack.kind = "Dog";
        chack.name = "Chack";
        chack.color = "White";
        chack.breed = "Husky";

        chack.hello();

        Device iphone = new Device();
        iphone.name = "iPhone";
        iphone.os = "Apple";
        iphone.color = "Gold";
        iphone.memory = 64;

        iphone.ring();

        Device samsung = new Device();
        samsung.name = "Samsung";
        samsung.os = "Android";
        samsung.color = "Black";
        samsung.memory = 128;

        samsung.lowBattery();

        Cities la = new Cities();
        la.name = "Los Angeles";
        la.population = 3990456;
        la.country = "USA";

        Cities odessa = new Cities();
        odessa.name = "Odessa";
        odessa.population = 993120;
        odessa.country = "Ukraine";

        odessa.introduction();

        Food sushi = new Food();
        sushi.name = "Sushi";
        sushi.brand = "Japanese";
        sushi.price = 30;

        Food noodles = new Food();
        noodles.name = "Pad See Ew";
        noodles.brand = "Thai";
        noodles.price = 15;

        noodles.menu();














=======
public class App {
    public static void main(String[] args) {
        Person anna = new Person();

        Person peter = new Person();
        peter.name="Peter";
        peter.lastName="Petroff";
        peter.year=1998;
        anna=peter;
//        anna.printMe();


        Person jack = new Person();
        jack.year=1989;
        jack.lastName="Daniels";
        jack.name="Jack";
        jack.hello(" Jonny Walker");

        Car mazda6 = new Car();
        mazda6.brand = "Mazda";
        mazda6.model="6";
        mazda6.color="Silver";
        mazda6.year=2015;

        mazda6.carStarted();
        mazda6.honk();
        mazda6.brakes();

        Car toyotaSienna = new Car();
        toyotaSienna.year=2015;
        toyotaSienna.color="Grey";
        toyotaSienna.model="Sienna EXL- Turbo";
        toyotaSienna.brand="Toyota";



        toyotaSienna.carStarted();
        toyotaSienna.brakes();

        Fruit s1 = new Fruit();
        s1.breed = "Apple Grenny Smith";
        s1.color = "Green";

        Fruit maraquiya = new Fruit();
        maraquiya.color="Crimson Light";
        maraquiya.breed="Maraquya";
>>>>>>> remotes/origin/master
    }
}
