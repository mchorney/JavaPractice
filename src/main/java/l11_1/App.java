package l11_1;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name ="Anna";
        anna.lastName = "Petrova";
        anna.year = 2000;
        anna.prinyOut();

        Person peter = new Person( "Peter",  "Jakobson",  1998);
        peter.prinyOut();

        Dog sharik = new Dog( "Sharik", "Dvorterier", 3);
        sharik.printOut();

    }
}
