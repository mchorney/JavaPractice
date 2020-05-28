package hmw10;

public class App {
    public static void main(String[] args) {
        //testing House class
        House newHome = new House();
        newHome.buyHouse(5, 300000);
        System.out.println("My new house has " + newHome.getRooms() + " rooms.");
        System.out.println("My new house is " + newHome.getSize() + ".");

        House myHome = new House();
        myHome.numOfRooms = 3;
        myHome.price=200000;
        System.out.println("My old house has " + myHome.getRooms() + " rooms.");
        System.out.println("My old house is " + myHome.getSize() + ".");
        System.out.println("My old house price is $" + myHome.getPrice());
        System.out.println("I can sell my house for $" + myHome.getPrice(3));
        myHome.sellHouse();

        //testing Car class
        Car myCar = new Car();
        myCar.make = "Audi";
        myCar.model = "Q3";
        myCar.year = 2017;
        myCar.speed(65);
        myCar.breaking();
        myCar.getCarDetails();


        Car newCar = new Car();
        newCar.getCar("BMW", "X1", 2018);
        System.out.println("New car make is: " + newCar.getMake() );
        System.out.println("New car model is: " + newCar.getModel() );
        System.out.println("New car year is: " + newCar.getYear() );
        newCar.fullSpeed();
        newCar.year = 2020;
        System.out.println("I decided to get new car year " + newCar.getYear() );


        //testing Dog class
        Dog myDog = new Dog();
        myDog.getDog("Bitcoin", "Goldendoodle", "brown", 0.5);
        System.out.println("My dog's name is " + myDog.getName());
        myDog.bark();
        myDog.playWithMaster("Rusana");
        myDog.getAge();

        Dog friendDog = new Dog();
        friendDog.setName("Megabyte");
        friendDog.breed = "Poodle";
        friendDog.color = "white";
        friendDog.age = 2.5;
        friendDog.getDogDetails();
        friendDog.getAge();


        //testing Breakfast class
        Breakfast myBreakfast = new Breakfast();
        myBreakfast.setBreakfast("Omlette");
        myBreakfast.addCoffee();
        myBreakfast.serveBreakfast();

        Breakfast meal = new Breakfast();
        meal.serveBreakfast();
        meal.food = "Avocado Toast";
        meal.serveBreakfast();
        meal.addCoffee();
        meal.addOrangeJuice();
        meal.serveBreakfast();

    }
}
