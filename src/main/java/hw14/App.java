package hw14;

public class App {
    public static void main(String[] args) {
        String[] loc = {"Floor_1", "Floor_2", "Floor_3"};
        Location gym = new Location("Bootcamp", "one_month", 300, "Fatburn", Coach.SWANSON, loc, "room5");
        String [] L = gym.setLocation();
        for (String v: L){
            System.out.println(v);
        }

        gym.printInfo("Future Champs");
        gym.printlocation();


    }
}

