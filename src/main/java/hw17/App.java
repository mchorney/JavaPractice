package hw17;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        HashMap<String, String> names = new HashMap<String, String>();
        names.put("babut", "beibit");
        names.put("trafi", "Water");
        names.put("Luffy", "monky");
        names.put("aibek", "Zarezovich");
        names.put("holod", "Solonovich");
        names.put("more", "Zimovich");
        names.replace("babut", "Water");
        names.remove("trafi", "Water");
        names.get("Luffy");
        for (Map.Entry<String, String> entry : names.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        HashMap<Integer, String> footballTeamBuyPopularty = new HashMap<Integer, String>();
        footballTeamBuyPopularty.put(1, "Altrincham F.C.");
        footballTeamBuyPopularty.put(2, "FCB");
        footballTeamBuyPopularty.put(3, "KSB");
        footballTeamBuyPopularty.put(4, "RUSSIAN somthing");
        footballTeamBuyPopularty.replace(3, "ffffffotbal team.");
        footballTeamBuyPopularty.remove(4);
        footballTeamBuyPopularty.get(2);
        for (String f : footballTeamBuyPopularty.values()) {
            System.out.println(f);
        }
        HashMap<Company, Coke> drink = new HashMap<Company, Coke>();

        Company fanta = new Company("fanta", "USA");
        Coke fanta1 = new Coke(1, "Ornge");
        Company up7 = new Company("7up", "Russia");
        Coke up71 = new Coke(2, "water");
        Company coke = new Company("coke", "USA");
        Coke coke1 = new Coke(1, "cherry");
        Company mountidew = new Company("mointdew", "USA");
        Coke mountidew1 = new Coke(1, "green trash");
        Company mountidew2 = new Company("mountidew", "German");


        drink.put(fanta, fanta1);
        drink.put(up7, up71);
        drink.put(coke, coke1);
        drink.put(mountidew, mountidew1);
        drink.replace(mountidew2, mountidew1);
        drink.remove(coke);
        for (Company k : drink.keySet()) {
            System.out.println(k.getName());
        }
    }
}
