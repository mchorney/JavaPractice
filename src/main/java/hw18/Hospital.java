package hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranseCompanies> acceptedInsuranses;
    private ArrayList<Doctor> doctors;

    public Hospital(String hospitalName, Address address, HashMap<Integer, String> rooms, ArrayList<InsuranseCompanies> acceptedInsuranses, ArrayList<Doctor> doctors) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address=" + address +
                ", rooms=" + rooms +
                ", acceptedInsuranses=" + acceptedInsuranses +
                ", doctors=" + doctors +
                '}';
    }

    public void printInfo() {
        System.out.println(hospitalName + " address: " + address + " we are accepting following insuarenses: " + acceptedInsuranses);

    }

    public void printDoctors() {
        doctors.forEach(x -> System.out.println(x));

    }

    public void printRooms() {
        rooms.forEach((x, y) -> System.out.println(x + "," + y));
    }
}
