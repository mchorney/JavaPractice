package l11;

public class App {
    public static void main(String[] args) {

    Bio name = new Bio();
    name.setFirstName("Bill");
    name.setLastName("Crazy");
    name.setOccupation("Killer");
    name.setMarriageStatus("Divorced");
    name.printClass();

    Bio name0 = new Bio("John", "Down", "Driver", "Married");
    name0.printClass();

    Bio name1 = new Bio("Bob", "Burger");
    name1.printClass();

    Bio name2 = new Bio("Raul", "Garcia", "Student");
    name2.printClass();

    String[] fullInfo = {"Don", "Hammer", "Blacksmith", "Married" };
    Bio name3 = new Bio(fullInfo);
    name3.printClass();


    Numbers one = new Numbers();
    one.setFavoriteNumber(5);
    one.printClass();

    Numbers two = new Numbers(new int[]{5, 6, 7});
    two.printClass();

    double[]doubleArray = new double[] {5.25, 25458.255, 5548.26, 0.5};
    Numbers three = new Numbers(doubleArray);
    three.printClass();

    Numbers four = new Numbers(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, doubleArray, 5);
    four.printClass();

    Sport soccer = new Sport();
    soccer.setSportName("Soccer");
    soccer.setPlayersName(new String[]{"Bob Donaldson", "Fred Erentz", "Joe Cassidy"});
    soccer.setYearChampion(new int[]{2015, 2016, 2020});
    soccer.printClass();

    String[] names = new String[]{"Jack Peddie", "Dick Duckworth", "Sandy Turnbull", "Arthur Whalley"};
    int[] years = new int[]{1989, 1990, 1995, 1998, 1999, 2005, 2008, 2012, 2013};

    Sport bowling = new Sport("Bowling", names, 98.5, years);
    bowling.printClass();
    }
}
