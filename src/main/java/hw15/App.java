package hw15;

public class App {
    public static void main(String[] args) {
        Chairs mychair = new Chairs("Ikea", "Lubrindeh", 256);
        ConferenceChair amazonConf = new Office("Zion", "zage45", 430, 300, "Whenever is open");

        KidsChair kidsJoy = new Home("LittleJoy", "Joy43", 56, 2, "When kids want to eat at the table");


        OfficeChair amazonOffice = new Office("Grid", "Gyde", 356, 512, "From 6am-9pm");

        GamingChair homeUsage = new Home("Ikea","Rundehtrust", 280, 1, "Whenever i need my chair" );


        homeUsage.gameLife();
        amazonConf.conferWonder();
        kidsJoy.kidies();

    }
}
