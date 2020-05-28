package hw10.l10;

public class App {
    public static void main(String[] args) {
        Person Wiliam = new Person();
        Wiliam.name = "Wiliam";
        Wiliam.lastName = "Shakespeare";
        Wiliam.year = 1564;

        Wiliam.printMe();

        Person mikhail = new Person();
        mikhail.name = "Mikhail";
        mikhail.lastName = "Glinka";
        mikhail.year = 1804;

        mikhail.printMe();

        Ballet swanLake = new Ballet();
        swanLake.nameOfballet = "Swane Lake";
        swanLake.nameOfcomposer = "Tchaikovsky";
        swanLake.yearOfcreation = 1876;

        swanLake.printMe();

        Ballet theNutecracker = new Ballet();
        theNutecracker.nameOfballet = "The Nutecracker";
        theNutecracker.nameOfcomposer = "Tchaikovsky";
        theNutecracker.yearOfcreation = 1892;

        theNutecracker.printMe();

        Whiskey chivasRegal = new Whiskey();
        chivasRegal.brand = "Chivas Regal";
        chivasRegal.producingCountry = "Scotlan";
        chivasRegal.maturedForatleast_years = 21;

        chivasRegal.printMe();

        Whiskey jackDaniels = new Whiskey();
        jackDaniels.brand = "Jack Daniels";
        jackDaniels.producingCountry = "USA";
        jackDaniels.maturedForatleast_years = 12;

        jackDaniels.printMe();

        Barries gooseberry = new Barries();
        gooseberry.name = " Gooseberry";
        gooseberry.color = "Green";
        gooseberry.placeOforigin = "Europe";

        gooseberry.printMe();

        Barries raspBerry = new Barries();
        raspBerry.name = "Raspberry";
        raspBerry.color = "Red";
        raspBerry.placeOforigin = "Russia";

        raspBerry.printMe();




    }
}
