package hw10;

public class App {
    public static void main(String[] args) {
        Bottle coce = new Bottle();
        coce.brand = "Coca-Cola";
        coce.Sugar_concentration = "Sugar free";
        coce.taste = "cherie";

        System.out.println(coce.brand);
        System.out.println(coce.Sugar_concentration);
        System.out.println(coce.taste);

        Bottle pepsi = new Bottle();
        pepsi.brand = "Pepsi";
        pepsi.Sugar_concentration = "Sugar 30% concentration";
        pepsi.taste = "bacon";

        System.out.println(" ");

        System.out.println(pepsi.brand);
        System.out.println(pepsi.Sugar_concentration);
        System.out.println(pepsi.taste);


        Snake Anaconda = new Snake();
        Anaconda.food= "deer";
        Anaconda.nation = "South America";
        Anaconda.poison = "poison free";

        Snake king_cobra = new Snake();
        king_cobra.food= "snake";
        king_cobra.nation = "Asia";
        king_cobra.poison = "deadly poison";

        Juices Apple = new Juices();
        Apple.brand= "Apple & Eve";
        Apple.liters = 1;
        Apple.taste = "apple";

        Juices orange = new Juices();
        orange.brand= "Tropicana";
        orange.liters = 2;
        orange.taste = "orange";

        Games Dota_2 = new Games();
        Dota_2.company= "Valve";
        Dota_2.Class = "strategic";
        Dota_2.popularty = 10000000;

        Games CSGO = new Games();
        CSGO.company= "valve";
        CSGO.Class = "actions";
        CSGO.popularty = 1500000;

    }
}
