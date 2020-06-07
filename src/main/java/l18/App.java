package l18;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        Address address = new Address("7901 Frost st", "San Diego", "California", 92123);

        Doctor amyAbola = new Doctor("Amy", "Abola", Position.FamilyPractitioner);
        Doctor annaGarcia = new Doctor("Anna", "Garcia", Position.Phlebotomist);
        Doctor franciscoGill = new Doctor("Francisco", "Gill", Position.PhysicalTherapist);
        Doctor bryanFox = new Doctor("Bryan", "Fox", Position.RadiologicTechnologist);
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(amyAbola);
        doctors.add(annaGarcia);
        doctors.add(franciscoGill);
        doctors.add(bryanFox);

        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(101, "Gastroenterology");
        rooms.put(102, "Family Medicine");
        rooms.put(103, "Internal Medicine");
        rooms.put(201, "Endocrinology");
        rooms.put(202, "Pediatrics");

        ArrayList<InsuranseCompamies> insuranseCompamies = new ArrayList<>();
        insuranseCompamies.add(InsuranseCompamies.Caresource);
        insuranseCompamies.add(InsuranseCompamies.Wellcare);
        insuranseCompamies.add(InsuranseCompamies.CaliforniaPhysiciansService);
        insuranseCompamies.add(InsuranseCompamies.AnthemInc);
        insuranseCompamies.add(InsuranseCompamies.BlueCrossBlueShieldofMichigan);
        insuranseCompamies.add(InsuranseCompamies.BlueCrossOfCalifornia);
        insuranseCompamies.add(InsuranseCompamies.UnitedHealth);
        insuranseCompamies.add(InsuranseCompamies.CignaHealth);
        insuranseCompamies.add(InsuranseCompamies.CVS);
        insuranseCompamies.add(InsuranseCompamies.Humana);
        insuranseCompamies.add(InsuranseCompamies.HighmarkGroup);
        insuranseCompamies.add(InsuranseCompamies.KaiserFoundation);

        Hospital sharpMemorialHospital = new Hospital("Sharp Memorial Hospital", address, doctors, rooms, insuranseCompamies);
        sharpMemorialHospital.printInfo();
        sharpMemorialHospital.printDoctors();
        sharpMemorialHospital.roomInfo();

    }
}
