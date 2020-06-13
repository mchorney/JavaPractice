package l12;

public class App {
    public static void main(String[] args) {

        Address ndhsAddress = new Address("465 New Dorp Lane", "Staten Island", States.NY,10306);
        School newDorpHighSchool = new School("NewDorp",SchoolType.PUBLIC,ndhsAddress);
        newDorpHighSchool.printOut();
        //"pub" "Pub"
        Snickers nikeAir = new Snickers("Nike","Air",new Colors[] {Colors.GREY,Colors.BLACK,Colors.PINK});
        MenuOfTheDay myDay = new MenuOfTheDay(Fastfood.FIVEGUYS);

        Address sitsAddress = new Address("485 Clawson Street","Staten Island",States.NY,10306);
        School siTechHighSchool = new School("Staten Island Technical High School", SchoolType.PUBLIC,sitsAddress);






    }
}
