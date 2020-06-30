package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospitals {
    private String hospitalName;
    private Address address;
    private List<Doctors> doctors;
    private List<InsuranceCompanies> insuranceCompanies;
    private Map<Integer,String> rooms;

    public Hospitals(String hospitalName, Address address, List<Doctors> doctors, List<InsuranceCompanies> insuranceCompanies, Map<Integer, String> rooms) {
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

    public List<Doctors> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctors> doctors) {
        this.doctors = doctors;
    }

    public List<InsuranceCompanies> getInsuranceCompanies() {
        return insuranceCompanies;
    }

    public void setInsuranceCompanies(List<InsuranceCompanies> insuranceCompanies) {
        this.insuranceCompanies = insuranceCompanies;
    }

    public Map<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(Map<Integer, String> rooms) {
        this.rooms = rooms;
    }


    public void printInfo() {
        System.out.println("Hospital: " +
                hospitalName + '\'' +
                ", address:  " + address.toString()+
                ". Doctors: "+doctors.toString()+
                "; acceptedInsurance: " + insuranceCompanies.toString() +
                " ");
    }

}
