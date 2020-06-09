package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> listRooms = new HashMap<>();
        listRooms.put(204,"Room of AUDIOLOGIST");
        listRooms.put(101,"Room of PEDIATRICIAN");
        listRooms.put(105,"Room of CARDIOLOGIST");
        listRooms.put(208,"Room of DERMATOLOGIST");
        listRooms.put(303,"Room of IMP");

        Address ad1 = new Address("101 Hospital St", "Denver", "CO", 80209);

        Doctor d1 = new Doctor("Tom", "Cruise", Position.CARDIOLOGIST);
        Doctor d2 = new Doctor("Samuel", "Jackson", Position.DERMATOLOGIST);
        Doctor d3 = new Doctor("Will", "Smith", Position.IMP);
        Doctor d4 = new Doctor("Bruce", "Willis", Position.AUDIOLOGIST);
        Doctor d5 = new Doctor("Chuck", "Norris", Position.IMP);
        Doctor d6 = new Doctor("John", "Travolta", Position.CARDIOLOGIST);
        Doctor d7 = new Doctor("Alex", "Johnson", Position.PEDIATRICIAN);
        Doctor d8 = new Doctor("Henry", "Cavill", Position.IMP);

        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(d1);doctors.add(d2);doctors.add(d3);doctors.add(d4);
        doctors.add(d5);doctors.add(d6);doctors.add(d7);doctors.add(d8);

        ArrayList<InsuranceCompanies> iCompanies = new ArrayList<InsuranceCompanies>();
        iCompanies.add(InsuranceCompanies.AETNA);
        iCompanies.add(InsuranceCompanies.AARP);
        iCompanies.add(InsuranceCompanies.CIGNA);
        iCompanies.add(InsuranceCompanies.HUMANA);
        iCompanies.add(InsuranceCompanies.WELLCARE);

        String hospitalName = "Chicago Public Hospital";
        Hospital newHospital = new Hospital(hospitalName, ad1, doctors, listRooms, iCompanies);

        newHospital.printInfo();
        System.out.println("-");
        newHospital.printDoctors();
        System.out.println("-");
        newHospital.printRooms();
        System.out.println("-");





    }
}