package hw15;

public class App {
    public static void main(String[] args) {
        Chairs mychair = new Chairs("Ikea", "Lubrindeh", 256);
        ConferenceChair amazonconf = new Office("Zion", "zage45", 430, 300, "Whenever is open");
        amazonconf = mychair;

        OfficeChair amazonoffice = new Office("Grid", "Gyde", 356, 512, "From 6am-9pm");

        GamingChair homeusage = new Home("Ikea","Rundehtrust", 280, 1, "Whenever i need my chair" );


    }
}
