package hw15;

public class App {
    public static void main(String[] args) {
        TypeOfH batman = new GoodH("Batman");
        TypeOfH superMan = new GoodH("Superman");
        TypeOfH joker = new BadH("Joker");
        TypeOfH zot = new BadH("general zot");

        batman.start();
        batman.finish();
        joker.start();
        joker.finish();

    }


}
