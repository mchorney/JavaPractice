package I10_1;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name ="Anna";
        anna.lastName="Ivanova";
        anna.year=1999;

        Person peter = new Person();
        peter.name ="Peter";
        peter.lastName="Petroff";
        anna.year=1998;

        Person jack = new Person();
        jack.name ="Jack";
        anna.lastName="Daniels";
        anna.year=1989;

        Car mazda6 = new Car();
        mazda6.brand = "Mazda";
        mazda6.model = "6";
        mazda6.color = "Silver";
        mazda6.year = 2015;


        Car toyotaSienna = new Car();
        toyotaSienna.brand = "Toyota";
        toyotaSienna.model = "Sienna EXL-Turbo";
        toyotaSienna.color = "Grey";
        toyotaSienna.year = 2015;

        Fruit s1 = new Fruit();
        s1.breed = "Apple Grenny Smith";
        s1.color = "Green";

        Fruit maraquiya = new Fruit();
        maraquiya.breed = "Crimeson Light";
        maraquiya.color = "Maraquya";




        System.out.println(anna.name);
        System.out.println(anna.lastName);
        System.out.println(anna.year);
        System.out.println(peter.name);
        System.out.println(peter.lastName);
        System.out.println(peter.year);
        System.out.println(jack.name);
        System.out.println(jack.lastName);
        System.out.println(jack.year);



    }

}
