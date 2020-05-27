package hw10;

public class App {

    public static void main(String[] args) {

        // horses
        Horse mustang = new Horse();
        mustang.familyName = "Mustang";
        mustang.run();
        mustang.sleep();

        Horse appaloosa = new Horse();
        appaloosa.familyName = "Appaloosa";
        appaloosa.run();
        appaloosa.sleep();

        // computers
        Computer macbook = new Computer();
        macbook.os = "Mac";
        macbook.turnOn();
        macbook.update();
        macbook.turnOff();

        Computer dell = new Computer();
        dell.os = "Windows";
        dell.turnOn();
        dell.update();
        dell.turnOff();

        // songs
        Song despasito = new Song();
        despasito.title = "Despasito";
        despasito.download();
        despasito.listen();

        Song thunder = new Song();
        thunder.title = "Thunder";
        thunder.download();
        thunder.listen();

        // teachers
        Teacher willSmith = new Teacher();
        willSmith.firstName = "Will";
        willSmith.lastName = "Smith";
        willSmith.topic = "OOP";
        willSmith.introduction();
        willSmith.doHomework();

        Teacher samuelJackson = new Teacher();
        samuelJackson.firstName = "Samuel";
        samuelJackson.lastName = "Jackson";
        samuelJackson.topic = "Inheritance";
        samuelJackson.introduction();
        samuelJackson.doHomework();
    }

}
