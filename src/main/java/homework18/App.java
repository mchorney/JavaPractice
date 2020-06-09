package homework18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class App {
    public static void main(String[] args) {
        List<InsuranceCompanies> acceptedInsuranses = new ArrayList<>();
        acceptedInsuranses.add(InsuranceCompanies.AETNA);
        acceptedInsuranses.add(InsuranceCompanies.CIGNA);
        acceptedInsuranses.add(InsuranceCompanies.KAISERFOUNDATION);
        acceptedInsuranses.add(InsuranceCompanies.PREMIERABLUECROSS);
        acceptedInsuranses.add(InsuranceCompanies.UNITEDHEALTH);

        Address hospital_address = new Address("1035 116th Ave NE", "Bellevue", "WA", 98004);
        Hospital OverlakeHospital = new Hospital("Overlake Hospital", hospital_address, acceptedInsuranses);
        OverlakeHospital.printInfo();

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Daniel", "Becker", Position.ANASTESIOLOGY));
        doctors.add(new Doctor("Jon", "Welch", Position.IMMUNOLOGY));
        doctors.add(new Doctor("Thao", "Trun", Position.ALLERGY));
        doctors.add(new Doctor("Alison", "Overland", Position.CARDIOLOGY));
        doctors.add(new Doctor("Casey", "Calson", Position.DERMATOLOGY));
        doctors.add(new Doctor("Mario", "Mercado", Position.ENDOCRINOLOGY));
        doctors.add(new Doctor("Robert", "Wohlman", Position.GASTROENTEROLOGY));
        doctors.add(new Doctor("Barry", "Lawson", Position.NEONATOLOGY));
        doctors.add(new Doctor("Brian", "Ferris", Position.ONCOLOGY));
        doctors.add(new Doctor("Silas", "Marshall", Position.ORTHOPEDIC));
        doctors.add(new Doctor("Trac", "Duong", Position.OTOLARINGOLOGY));
        doctors.add(new Doctor("Nicolas", "Jonas", Position.NEUROLOGY));
        doctors.add(new Doctor("Elizabeth", "Miller", Position.UROLOGY));
        doctors.add(new Doctor("Kathryn", "Arendt", Position.CYNECOLOGY));
        doctors.add(new Doctor("Amber", "Anderson", Position.PEDIATRICS));
        Hospital hospitals_doctors = new Hospital(doctors);
        hospitals_doctors.printDoctors();

        Map<Integer, Speciality> rooms = new HashMap<>();
        rooms.put(1, new Speciality(("ANASTESIOLOGY")));
        rooms.put(2, new Speciality(("IMMUNOLOGY")));
        rooms.put(3, new Speciality(("ALLERGYY")));
        rooms.put(4, new Speciality(("CARDIOLOGY")));
        rooms.put(5, new Speciality(("DERMATOLOGY")));
        rooms.put(6, new Speciality(("ENDOCRINOLOGY")));
        rooms.put(7, new Speciality(("GASTROENTEROLOGY")));
        rooms.put(8, new Speciality(("NEONATOLOGY")));
        rooms.put(9, new Speciality(("ONCOLOGY")));
        rooms.put(10, new Speciality(("ORTHOPEDIC")));
        rooms.put(11, new Speciality(("OTOLARINGOLOGY")));
        rooms.put(12, new Speciality(("NEUROLOGY")));
        rooms.put(13, new Speciality(("UROLOGY")));
        rooms.put(14, new Speciality(("CYNECOLOGY")));
        rooms.put(15, new Speciality(("PEDIATRICS")));
        Hospital rooms_and_positions = new Hospital(rooms);
        rooms_and_positions.printRooms();
    }
}

