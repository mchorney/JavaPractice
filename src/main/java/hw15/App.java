package hw15;

public class App {
    public static void main(String[] args) {
        Animal beba = new Cow("Beba", "brown", 5);
        Animal pika = new Cow("Pika", "black", 6);
        Animal jack = new Dog("Jack", "white", 4);
        Animal duke = new Dog("Duke", "grey", 3);
        beba.animalSound();
        beba.eat();
        beba.sleep();
        pika.animalSound();
        pika.eat();
        pika.sleep();
        jack.animalSound();
        jack.eat();
        jack.sleep();
        duke.animalSound();
        duke.eat();
        duke.sleep();

    }
}
