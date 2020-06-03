package hw14;

public class App {
    public static void main(String[] args) {
        Supermarket billa= new Supermarket("Pobeda",City.DNIPRO,2001);
        billa.invitationInfo("'Day after day!'");

        System.out.println(billa.toString());

        Supermarket1 billa1= new Supermarket1("East",City.MOSCOW,2018,"Kuku",Format.DISCOUNTER);
        billa1.invitationInfo("");

        System.out.println(billa1.toString());

        Schedule[] bill3Schedule= new Schedule[]{Schedule.FRIDAY_7AM_11PM,Schedule.MONDAY_8AM_9PM,Schedule.TUESDAY_8AM_9PM};
        Supermarket3 billa3= new Supermarket3("West",City.KIEV, 2019,"Ivanov",Format.HYPERMARKET,bill3Schedule);
        billa3.invitationInfo("'We are the first!'");

        System.out.println(billa3.toString());


    }
}
