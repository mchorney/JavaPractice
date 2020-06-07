package hw18;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class APp {
        public static void main(String[] args) {

            Address metropolitanAddress = new Address("bermutski triugol", "SOme were in ocean", "Atlantida", 666);
            ArrayList<InsuranceCompanies> listOfIncurances = new ArrayList<>();
            Collections.addAll(listOfIncurances, InsuranceCompanies.AETNA, InsuranceCompanies.UNITED_HEALTHCARE);
            Hospital metropolitan = new Hospital("Monster healing center", metropolitanAddress, listOfIncurances);
            metropolitan.printInfo();

            Doctor physician = new Doctor("Banjamin", "Deadick", Position.ALCHAMEST);
            Doctor cardiologyst = new Doctor("Benjamin", "Johanson", Position.NECROMANCER);
            Doctor nephrologyst = new Doctor("monstik", "Franky", Position.Surger);
            Doctor gastroenterologyst = new Doctor("Matthew", "Peterson", Position.VEDMAK);
            Doctor otolaryngologyst = new Doctor("Samantha", "Miller", Position.WITCH);
            ArrayList<Doctor> listOfDoctors = new ArrayList<>();
            Collections.addAll(listOfDoctors, physician, cardiologyst, nephrologyst, gastroenterologyst, otolaryngologyst);
            for (Doctor v: listOfDoctors) {
                v.printDoctors();
            }

            HashMap<Integer, String> rooms = new HashMap<>();
            rooms.put(1, "drug maker");
            rooms.put(2, "morg man");
            rooms.put(3, "surgery");
            rooms.put(4, "cardiolog");
            rooms.put(5, "Dietolog");
            System.out.println("Rooms: " + rooms);
        }
}
