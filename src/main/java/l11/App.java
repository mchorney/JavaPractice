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





    }
}
