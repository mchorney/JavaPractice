package hw15;

public class App {
    public static void main(String[] args) {
        Storm rain = new Raining(RainTypes.CONVECTIONAL, 25, true);
        Storm lightning = new Lightning(5, 10, "Loud", true);

        rain.beginning();
        rain.continued();
        rain.finishing();

        lightning.beginning();
        lightning.continued();
        lightning.finishing();
    }
}
