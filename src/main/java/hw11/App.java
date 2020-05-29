package hw11;

public class App {
    public static void main(String[] args) {

        // horses
        Horse pirate = new Horse();
        pirate.setName("Pirate");
        pirate.setAge(8);
        pirate.setColor("Black");
        pirate.printClass();
        String[] colors = {"White", "Black", "Grey", "Brown", "Chestnut"};
        Horse apollon = new Horse("Apollon", 7, colors[0]);
        apollon.printClass();

        // songs
        Song despasito = new Song();
        despasito.setTitle("Despasito");
        despasito.setArtist("Luis Fonsi");
        despasito.setYear(2017);
        despasito.setGenre("Pop");
        despasito.printClass();
        Song thunder = new Song("Thunder", "Imagine Dragons", 2017, "Pop");
        thunder.printClass();

        // teachers
        Teacher peter = new Teacher();
        peter.setFirstName("Peter");
        peter.setLastName("Jackson");
        peter.setTopic("Inheritance");
        peter.printClass();
        Teacher tom = new Teacher("Tom", "Cruise", "Encapsulation");
        tom.printClass();

    }
}
