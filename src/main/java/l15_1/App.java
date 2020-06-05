package l15_1;

public class App {
    public static void main(String[] args) {
        Lights lights = new Lights(5000);
        TableLight deskLight = new TableLight("Super", "triStar", 25, 3000);
        lights = deskLight;

        Bulb l1 = new TableLight("Super", "FourStar", 30, 4000);
        Plug l2 = new TableLight("Super", "SStar", 35, 5000);

        BathLight bathLight = new BathLight("BathLight", "M3", 25, 5000);

        Bulb[] bulbs ={deskLight,bathLight,l1};

        deskLight.e27();
        bathLight.e27();

    }

}
