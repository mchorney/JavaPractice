package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer,String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsurances;
    private static int hospitalStatistic;

    public Hospital() {
    }

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranceCompanies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsuranses;
        hospitalStatistic++;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<InsuranceCompanies> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public void setAcceptedInsurances(ArrayList<InsuranceCompanies> acceptedInsuranses) {
        this.acceptedInsurances = acceptedInsuranses;
    }

    public static int getHospitalStatistic() {
        return hospitalStatistic;
    }

    public static void setHospitalStatistic(int hospitalStatistic) {
        Hospital.hospitalStatistic = hospitalStatistic;
    }

    public void printInsuranceInfo() {
        System.out.println("Hospital name is: " + hospitalName);
        System.out.println("Located: " + address.getObjectAddress());
        System.out.println("Hospital accepts next insurances: ");
        acceptedInsurances.forEach(System.out::println);
        System.out.println();
    }

    public void printDoctors() {
        System.out.println("Hospital Doctor Staff: ");
        for (Doctor doctor : doctors) System.out.println(doctor.getObjectDoctor());
        System.out.println();
    }

    public void printRooms() {
        System.out.println("You can get our services here: ");
        for (Map.Entry<Integer, String> entry : rooms.entrySet()) {
            System.out.println("room number: " + entry.getKey() + " " + entry.getValue() + " department");
        }
        System.out.println();
    }
}
