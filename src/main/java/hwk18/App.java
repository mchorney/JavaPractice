package hwk18;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Address address = new Address("12345 De Soto Ave", "Woodland Hills", "CA", 91367);

        Doctor cardiologist = new Doctor("John", "Snow", Position.CARDIOLOGIST );
        Doctor surgeon = new Doctor("Meredith", "Grace", Position.SURGEON);
        Doctor therapist = new Doctor("Elton", "John", Position.THERAPIST);
        Doctor primary = new Doctor("Joan", "Fang", Position.PRIMARY_CARE);
        Doctor pediatrician = new Doctor("Mike", "Braddy", Position.PEDIATRICIAN);
        Doctor physiotherapist = new Doctor("Jake", "Blake", Position.PHYSIOTHERAPIST);
        Doctor psychiatrist = new Doctor("Mary", "Jane", Position.PSYCHIATRIST);

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(cardiologist);
        doctors.add(surgeon);
        doctors.add(therapist);
        doctors.add(primary);
        doctors.add(pediatrician);
        doctors.add(physiotherapist);
        doctors.add(psychiatrist);

        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(10, "Surgery");
        rooms.put(22, "Physiotherapy");
        rooms.put(34, "Intensive Care Unit");
        rooms.put(12, "Radiology");
        rooms.put(14, "Therapy Room");
        rooms.put(1, "Emergency");
        rooms.put(15, "Recovery");

        ArrayList<InsuranceCompanies> insurances = new ArrayList<>();
        insurances.add(InsuranceCompanies.AETNA);
        insurances.add(InsuranceCompanies.BLUECROSS);
        insurances.add(InsuranceCompanies.KAISER);
        insurances.add(InsuranceCompanies.CIGNA);
        insurances.add(InsuranceCompanies.HUMANA);

        Hospital kaiser = new Hospital("Kaiser Permanente", address, doctors, rooms,  insurances);
        kaiser.printInfo();
        kaiser.printDoctors();
        kaiser.printRooms();


    }
}
