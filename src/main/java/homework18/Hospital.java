package homework18;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer, Speciality> rooms;
    private List<InsuranceCompanies> acceptedInsuranses;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, Speciality> rooms, List<InsuranceCompanies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public Hospital(String hospitalName, Address address, List<InsuranceCompanies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public Hospital(Map<Integer, Speciality> rooms) {
        this.rooms = rooms;
    }


    public Hospital(List<Doctor> doctors) {
        this.doctors = doctors;
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

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Map<Integer, Speciality> getRooms() {
        return rooms;
    }

    public void setRooms(Map<Integer, Speciality> rooms) {
        this.rooms = rooms;
    }

    public List<InsuranceCompanies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void setAcceptedInsuranses(List<InsuranceCompanies> acceptedInsuranses) {
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public void printInfo() {
        System.out.println("Hospital name: " + hospitalName + "; " +
                "Hospital address: " + address + "; " +
                "Accepted Insuranses: " + acceptedInsuranses
        );
    }

    public void printDoctors() {
        System.out.println("Overlake Hospital doctors: ");
        for (Doctor v : doctors) {
            System.out.println(v);
        }
    }

    public void printRooms() {
        System.out.println("Room number and Specialty: ");

        for (Integer i : rooms.keySet()) {
            System.out.println("Room number: " + i + ", " + rooms.get(i));
        }

    }
}



