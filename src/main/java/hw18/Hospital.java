package hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {

    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer, String> rooms;

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

    public ArrayList<InsuranceCompanies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void setAcceptedInsuranses(ArrayList<InsuranceCompanies> acceptedInsuranses) {
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public Hospital(String hospitalName, Address address, ArrayList<InsuranceCompanies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms,
                    ArrayList<InsuranceCompanies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    private ArrayList<InsuranceCompanies> acceptedInsuranses;

    public void printInfo() {
//        System.out.println("Hospital name is " + hospitalName + ", address is " + address +
//                ", acceptedInsuranses are: " + acceptedInsuranses);
        System.out.println("Hospital's name is " + hospitalName);
        address.printInfo();
        System.out.println("Insurances Accepted by a Hospital are " + acceptedInsuranses);
    }
}
