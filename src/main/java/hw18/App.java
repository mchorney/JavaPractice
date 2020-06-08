package hw18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        Address address = new Address("25th Ave W", "Washington D.C.", "District of Columbia", 32014);

        Doctor doc1 = new Doctor("Jim", "Carter", Position.PEDIATRIC);
        Doctor doc2 = new Doctor("Jon", "Smith", Position.OPHTHALMOLOGIST);
        Doctor doc3 = new Doctor("Dow", "Jones", Position.DENTIST);
        Doctor doc4 = new Doctor("Kim", "ChanIr", Position.ORTHODONTIST);
        Doctor doc5 = new Doctor("Ho", "Bo", Position.PHYSICIAN);
        ArrayList<Doctor> doctorList = new ArrayList<>();
        doctorList.add(doc1);
        doctorList.add(doc2);
        doctorList.add(doc3);
        doctorList.add(doc4);
        doctorList.add(doc5);

        HashMap<Integer,String> rooms = new HashMap<>();
        rooms.put(1, "Pediatrician");
        rooms.put(2, "Ophthalmology");
        rooms.put(3, "Dentistry");
        rooms.put(4, "Orthodontic");
        rooms.put(5, "Physician");

        ArrayList<InsuranceCompanies> insuranceCompanies = new ArrayList<>(Arrays.asList(InsuranceCompanies.MOLINA, InsuranceCompanies.PREMERA_BLUE_CROSS));
        insuranceCompanies.add(InsuranceCompanies.KAISER);
        insuranceCompanies.add(InsuranceCompanies.AETNA);
        insuranceCompanies.add(InsuranceCompanies.UNITE_HEALTH_CARE);

        Hospital hospital = new Hospital("Best Care", address, doctorList, rooms, insuranceCompanies);

        hospital.printInsuranceInfo();
        hospital.printDoctors();
        hospital.printRooms();
    }
}
