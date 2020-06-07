package hw18;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;

public class Work {
    public static void main(String[] args) {
        //Address coneyIsland = new Address("2601 Ocean Pkwy","Brooklyn","NY",11235);
        Address presbyterianQueens = new Address("56-45 Main St","Queens","NY",11355);
        Doctor marina = new Doctor("Marina","Yakubova",Position.OBGYN);
        Doctor oxana = new Doctor("Oxana","Odzial",Position.SURGEON);
        Doctor creig = new Doctor("Creig","Koffman",Position.CARDIOLOGIST);
        Doctor sam = new Doctor("Sam","Groom",Position.PHYSICIAN);
        Doctor priyanka = new Doctor("Priyanka","Koli",Position.OPHTHALMOLOGIST);

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(marina);
        doctors.add(oxana);
        doctors.add(creig);
        doctors.add(sam);
        doctors.add(priyanka);

        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(34,"Gynecology Room");
        rooms.put(24,"Operation Room");
        rooms.put(11,"Cardiology Room");
        rooms.put(56,"Physician Room");
        rooms.put(48,"Ophthalmology Room");

        ArrayList<InsuranceCompanies> insuranceCompanies = new ArrayList<>();
        insuranceCompanies.add(InsuranceCompanies.UnitedHealthCare);
        insuranceCompanies.add(InsuranceCompanies.AETNA);
        insuranceCompanies.add(InsuranceCompanies.Fedelis);
        insuranceCompanies.add(InsuranceCompanies.HealthFirst);
        insuranceCompanies.add(InsuranceCompanies.LibertyHealth);

        Hospital queensPresbyterian = new Hospital("New York-Presbyterian Queens",presbyterianQueens,doctors,rooms,insuranceCompanies);
        queensPresbyterian.printInfo();
        queensPresbyterian.printDoctors();
        queensPresbyterian.printRooms();
    }
}
