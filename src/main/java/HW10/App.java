package HW10;

import l10.Person;

import java.awt.print.Book;

public class App {
    public static void main(String[] args) {
        TvShow BigBang = new TvShow();
        BigBang.name = "The Big-Bang Theory";
        BigBang.type="Comedy";
        BigBang.limitation="PG-16";
        BigBang.rating=4.9998;
        BigBang.year=2012;
        BigBang.familyFriendly=true;
        BigBang.printMe();

        Games DA = new Games();
        DA.name = "Dragon Age";
        DA.type="Fantasy";
        DA.year=1998;
        DA.limitation="PG-16";
        DA.rating= 4.83;
        DA.printMe();

        Clothes Dress = new Clothes();
        Dress.name = "Dress";
        Dress.type="Casual";
        Dress.size=30;
        Dress.color="Blue";
        Dress.female=true;
        Dress.printMe();

        Books Twilight = new Books();
        Twilight.name= "Twilight";
        Twilight.type="Romance, Vampires";
        Twilight.author="Stephenie Meyer";
        Twilight.rating=3.0113;
        Twilight.price=120;
        Twilight.printMe();

    }
}
