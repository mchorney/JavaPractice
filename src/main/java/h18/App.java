package h18;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Address1 address = new Address1("4300 Alton Road", "Miami Beach", "Florida", 33140);

        ArrayList<InsuranceCompanies> insuranceCompanies = new ArrayList<>();
        insuranceCompanies.add(InsuranceCompanies.ALPHA_INSURANCE);
        insuranceCompanies.add(InsuranceCompanies.INGOSSTRAKH);
        insuranceCompanies.add(InsuranceCompanies.CAPITAL_INSURANCE);
        insuranceCompanies.add(InsuranceCompanies.ROSGOSSTRAKH);
        insuranceCompanies.add(InsuranceCompanies.ORANTA);
        insuranceCompanies.add(InsuranceCompanies.RENAISSANCE_INSURANCE);

        Hospital hospital = new Hospital("MOUNT SINAI MEDICAL CENTER",address,insuranceCompanies);
        hospital.printInsur();

        Doctor doctor1 = new Doctor("Albert","Hopkins",Position.THERAPIST);
        Doctor doctor2 = new Doctor("Steven","Sort",Position.PHYSICIAN);
        Doctor doctor3 = new Doctor("Dora","Novick",Position.HEMATOLOGIST);
        Doctor doctor4 = new Doctor("Lora","Smith",Position.CARDIOLOGIST);
        Doctor doctor5 = new Doctor("Elsa","Osborn",Position.RHEUMATOLOGIST);

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        doctors.add(doctor5);
        for(Doctor v:doctors){
            v.printDoc();
        }

        HashMap<Integer,String>rooms = new HashMap<>();
        rooms.put(12,"cabinet of Therapist");
        rooms.put(45,"cabinet of Physician");
        rooms.put(44,"cabinet of Hematologist");
        rooms.put(23,"cabinet of Cardiologist");
        rooms.put(56,"cabinet of Rheumatologist");
        System.out.println("Rooms: "+rooms);
        for(Integer k:rooms.keySet()){
            System.out.println(k);
            System.out.println(rooms.get(k));
        }
    }
}
