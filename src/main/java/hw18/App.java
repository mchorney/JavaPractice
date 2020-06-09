package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        HashMap<Integer, String> rooms= new HashMap<>();
        rooms.put(2,"Cardiology");
        rooms.put(10,"Dermatology");
        rooms.put(12,"Onkology");
        rooms.put(9,"Radiology");
        rooms.put(5,"Neurology");

        ArrayList<InsuranseCompanies> acceptedInsuranses= new ArrayList<>();
        acceptedInsuranses.add(InsuranseCompanies.CVS);
        acceptedInsuranses.add(InsuranseCompanies.AMERICAN_FAMILY);
        acceptedInsuranses.add(InsuranseCompanies.PROGRESSIVE);
        acceptedInsuranses.add(InsuranseCompanies.STATE_FARM);
        acceptedInsuranses.add(InsuranseCompanies.UNITED_HEALTH);
        acceptedInsuranses.add(InsuranseCompanies.WELLCARE);

        ArrayList<Doctor> doctors= new ArrayList<>();
        doctors.add(new Doctor("Ivan","Ivanov",Position.CARDIOLOGIST));
        doctors.add(new Doctor("Vasya","Danilov",Position.DERMATOLOGIST));
        doctors.add(new Doctor("Slava","Zadov",Position.ONCOLOGIST));
        doctors.add(new Doctor("Zoya","Smith",Position.PEDIATRICIAN));
        doctors.add(new Doctor("Lena","Horina",Position.SURGEON));

        Address iowa= new Address("Hickman","Des Moines","IA",50323);
        Hospital mercyClinic= new Hospital("Mercy Clinic",iowa,rooms,acceptedInsuranses,doctors);

        mercyClinic.printInfo();
        mercyClinic.printDoctors();
        mercyClinic.printRooms();
    }
}
