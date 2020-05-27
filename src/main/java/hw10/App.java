package hw10;

public class App {

    /*
    1. Создайте 4 класса в которых есть поля (fields) и методы (methods)
    2. В классе App создайте функцию main() и создайте в ней по 2 объекта каждого класса - покажите как они работают
     */

    public static void main(String[] args) {

        // butterflies

        Butterfly monarch = new Butterfly();
        monarch.familyName = "Monarch";
        monarch.eat();
        monarch.fly();

        Butterfly viceroy = new Butterfly();
        viceroy.familyName = "Viceroy";
        viceroy.fly();
        viceroy.eat();

        // games

        Game monopoly = new Game();
        monopoly.name = "Monopoly";
        monopoly.play();
        monopoly.win();

        Game twister = new Game();
        twister.name = "Twister";
        twister.play();
        twister.lose();

        // movies

        Movie limitless = new Movie();
        limitless.title = "Limitless";
        limitless.download(2.0);
        limitless.watch();

        Movie avatar = new Movie();
        avatar.title = "Avatar";
        avatar.download(1.5);
        avatar.watch();

        // students

        Student tomSmith = new Student();
        tomSmith.firstName = "Tom";
        tomSmith.lastName = "Smith";
        tomSmith.age = 23;
        tomSmith.introduction();
        tomSmith.doHomework(10);

        Student marthaJohnson = new Student();
        marthaJohnson.firstName = "Martha";
        marthaJohnson.lastName = "Johnson";
        marthaJohnson.age = 21;
        marthaJohnson.introduction();
        marthaJohnson.doHomework(25);
    }

}
