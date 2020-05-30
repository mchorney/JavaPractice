package hwk11;

public class Work {
    public static void main(String[] args) {
        //testing House class
        House newHome = new House();
        newHome.setSize("Big");
        newHome.setNumOfRooms(5);
        newHome.setPrice(300000);
        newHome.printClass();

        House myHome = new House("small", 3, 100000);
        myHome.printClass();

        //testing Car class
        Car myCar = new Car();
        myCar.setMake("Audi");
        myCar.setModel("Q3");
        myCar.setYear(2017);
        myCar.setPreviousCars(new String[]{"Kia", "BMW", "Volvo"});
        myCar.printClass();


        Car newCar = new Car("Audi", "A4", 2020, new String[]{"Kia", "BMW", "Toyota"});
        newCar.printClass();


        //testing Dog class
        Dog myDog = new Dog();
        myDog.setName("Marli");
        myDog.setAge(2);
        myDog.setBreed("Doodle");
        myDog.setColor("White");
        myDog.printClass();


        Dog anotherDog = new Dog("Pupsik", "Poodle", "Black", 1);
        anotherDog.printClass();

    }
}

