package hw10;

public class App {
    public static void main(String[] args) {
        Flower rose = new Flower();
        rose.sort = "William Shakespeare";
        rose.name = "roses";
        rose.color = "red";
        rose.price = 25;

        rose.bouquet();

        System.out.println("***********************");
        Flower tulip = new Flower();
        tulip.color = "black";
        tulip.name = "tulips";
        tulip.sort = "Black prince";
        tulip.price = 18;

        tulip.bouquet();

        System.out.println("-----------------------------------------------------------------------------------");

        Weather current = new Weather();
        current.color = "blue";
        current.sky = "clear";
        current.time = 12.45;
        current.dayTemperature = 75.5;
        current.nightTemperature = 54.3;

        current.today();
        current.averageTemp();

        System.out.println("***********************");

        Weather tomorrow = new Weather();
        tomorrow.color = "gray";
        tomorrow.sky = "cloudy";
        tomorrow.time = 15.45;
        tomorrow.dayTemperature = 65.5;
        tomorrow.nightTemperature = 45.2;

        tomorrow.today();
        tomorrow.averageTemp();

        System.out.println("-----------------------------------------------------------------------------------");

        Sport football = new Sport();
        football.type = "Football is the summer team game";
        football.year = 1825;
        football.country = "England";
        football.female = true;
        football.likes = false;

        football.countrySport();
        System.out.println("***********************");

        Sport hockey = new Sport();
        hockey.type = "Hockey is the winter team game";
        hockey.year = 1946;
        hockey.country = "Canada";
        hockey.female = false;
        hockey.likes = true;

        hockey.countrySport();

        System.out.println("-----------------------------------------------------------------------------------");

        Book literature = new Book();
        literature.year = 1940;
        literature.author = "Bulgakov";
        literature.size = 566.5;
        literature.name = "Master and Margarita";

        literature.bookSize();
        literature.bookYear();

        System.out.println("***********************");

        Book math = new Book();
        math.year = 1995;
        math.author = "Freidman";
        math.size = 166.5;
        math.name = "Calculus for Everyone";

        math.bookSize();
        math.bookYear();
    }
}






