package HW18;

import java.util.ArrayList;
import java.util.HashMap;

public class Work {
    public static void main(String[] args) {
//    NURSE,
//    PHYSICIAN,
//    THERAPIST,
//    PHARMACIST,
//    DENTIST,
//    DIETICIAN

        HashMap<Integer,String> rooms = new HashMap<>();
        rooms.put(101,"Nurse room");
        rooms.put(107,"Dietician room");
        rooms.put(203,"Therapist room");
        rooms.put(307,"Physician room");
        rooms.put(209,"Dentist room");
        rooms.put(103,"Pharmacist room");


        Doctor doc1 = new Doctor("Holly", "Molly", Position.DIETICIAN);
        Doctor doc2 = new Doctor("Jack", "Nicolas", Position.DENTIST);
        Doctor doc3 = new Doctor("Nill", "Mccarthy", Position.PHARMACIST);
        Doctor doc4 = new Doctor("Hanna", "Milesko", Position.NURSE);
        Doctor doc5 = new Doctor("Rony", "Doll", Position.PHYSICIAN);
        Doctor doc6 = new Doctor("Mia", "Kolesky", Position.THERAPIST);
        Doctor doc7 = new Doctor("Renat", "Syleimanov", Position.NURSE);


        Address adr1 = new Address("256 Greedy St", "Colban", "WA", 98345);
        Address adr2 = new Address("74 Sunny St S", "Welden", "CO", 76045);
        Address adr3 = new Address("134 Denver Ave S", "Denver", "CO", 76940);
        Address adr4 = new Address("124 Beach St", "Sunlight", "CA", 10734);
        Address adr5 = new Address("23 Ave S", "Newhalem", "WA", 98138);
        Address adr6 = new Address("214 Rondel St", "Gretten", "WI", 75334);
        Address adr7 = new Address("12 Colby Ave", "Berrien Springs", "MI", 96234);


        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(doc1);
        doctors.add(doc2);
        doctors.add(doc3);
        doctors.add(doc4);
        doctors.add(doc5);
        doctors.add(doc6);
        doctors.add(doc7);


        ArrayList<InsuranceCompanies> insurances = new ArrayList<>();
        insurances.add(InsuranceCompanies.UNITEDHEALTHCARE);
        insurances.add(InsuranceCompanies.AETNA);
        insurances.add(InsuranceCompanies.ASSURANT);
        insurances.add(InsuranceCompanies.BLUECROSSBLUESHIELD);
        insurances.add(InsuranceCompanies.CIGNA);
        insurances.add(InsuranceCompanies.HUMANA);


        String hospitalName = "Bellevue life hospital";
        Hospital nh = new Hospital(hospitalName, adr2, doctors, rooms, insurances);

        nh.hospitalInfo();
        nh.printDoctors();
        nh.printRooms();









    }
}
