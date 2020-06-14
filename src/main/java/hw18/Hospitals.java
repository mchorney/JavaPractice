package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospitals {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctors> doctors;
    private ArrayList<InsuranceCompanies> insuranceCompanies;
    private HashMap<Integer,String> rooms;

    public Hospitals(String hospitalName, Address address, ArrayList<Doctors> doctors, ArrayList<InsuranceCompanies> insuranceCompanies, HashMap<Integer, String> rooms) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.insuranceCompanies = insuranceCompanies;
        this.rooms = rooms;
    }

    public Hospitals(String hospitalName, Address address, List<Doctors> doctors, Map<Integer, String> listRooms, List<InsuranceCompanies> iCompanies) {
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

    public ArrayList<Doctors> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctors> doctors) {
        this.doctors = doctors;
    }

    public ArrayList<InsuranceCompanies> getInsuranceCompanies() {
        return insuranceCompanies;
    }

    public void setInsuranceCompanies(ArrayList<InsuranceCompanies> insuranceCompanies) {
        this.insuranceCompanies = insuranceCompanies;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Integer, String> rooms) {
        this.rooms = rooms;
    }


    public void printInfo() {
        System.out.println("Hospital: " +
                hospitalName + '\'' +
                ", address:  " + address.getStreetAddress() +
                ". Doctors: "+doctors.toString()+
                "; acceptedInsurance: " + insuranceCompanies.toString() +
                " ");
    }

}
