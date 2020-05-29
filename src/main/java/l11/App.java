package l11;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Petrova";
        anna.year = 2000;
        anna.printOut();

        Person peter = new Person("Peter","Jakobson",1990);
        peter.printOut();

        Dog sharik = new Dog("Sharik","Dvorterier",3);
        sharik.printOut();
        Dog mimi = new Dog();
        mimi.printOut();

        Cat cat = new Cat("Cat");

        Car mazda = new Car("Mazda","CX7",2020);
        mazda.setModel("CX9");
        mazda.setYear(2023);
        System.out.println(mazda.toString());

        String [] col = {"Green","Red", "Black"};
        Snickers nikeWonder = new Snickers("Wonder",col);

        String[] c = nikeWonder.getColor();
        for (String v:c){
            System.out.println(v);
        }

    }
}
