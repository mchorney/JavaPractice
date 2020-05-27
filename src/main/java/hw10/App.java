package hw10;

public class App {
    public static void main(String[] args) {
        Bottle coce = new Bottle();
        coce.brand = "Coca-Cola";
        coce.sugar_concentration = "Sugar free";
        coce.taste = "cherie";
        coce.lol();

        Bottle pepsi = new Bottle();
        pepsi.brand = "Pepsi";
        pepsi.sugar_concentration = "Sugar 30% concentration";
        pepsi.taste = "bacon";
        pepsi.lol();

        Snake Anaconda = new Snake();
        Anaconda.food= "deer";
        Anaconda.nation = "South America";
        Anaconda.poison = "poison free";
        Anaconda.lol2();

        Snake king_cobra = new Snake();
        king_cobra.food= "snake";
        king_cobra.nation = "Asia";
        king_cobra.poison = "deadly poison";
        king_cobra.lol2();

        Juices Apple = new Juices();
        Apple.brand= "Apple & Eve";
        Apple.liters = 1;
        Apple.taste = "apple";
        Apple.lol1();

        Juices orange = new Juices();
        orange.brand= "Tropicana";
        orange.liters = 2;
        orange.taste = "orange";
        orange.lol1();

        Games Dota_2 = new Games();
        Dota_2.company= "Valve";
        Dota_2.vclass = "strategic";
        Dota_2.popularty = 10000000;
        Dota_2.lol3();

        Games CSGO = new Games();
        CSGO.company= "valve";
        CSGO.vclass = "actions";
        CSGO.popularty = 1500000;
        CSGO.lol3();

    }
}
