package hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Address shAddress = new Address("923 Oak street", "Santa-fe", "Texas", 40035);
        Doctor one = new Doctor("Ken", "Follett", Position.PEDIATRICIAN);
        Doctor two = new Doctor("Max", "Fray", Position.DERMATOLOGIST);
        Doctor three = new Doctor("Patrick", "Rothfuss", Position.OBGYN);
        Doctor four = new Doctor("Lois", "Lowry", Position.SURGEON);

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(one);
        doctors.add(two);
        doctors.add(three);
        doctors.add(four);

        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(192,"Pediatrician room");
        rooms.put(23,"Dermatologist room");
        rooms.put(65,"Surgery");
        rooms.put(92,"OBGYN");

        ArrayList<InsuranceCompanies> acceptedInsurance = new ArrayList<>();
        acceptedInsurance.add(InsuranceCompanies.CIGNA);
        acceptedInsurance.add(InsuranceCompanies.KAISER);

        Hospital sh = new Hospital("Sacred Hearts",shAddress,doctors,rooms,acceptedInsurance);
        sh.printInfo();
        sh.printRooms();
        sh.printDoctors();

    }
}
