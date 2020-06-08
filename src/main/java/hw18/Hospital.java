package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer, String> rooms;
    private ArrayList<InsuranseCompanies> acceptedInsuranses;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranseCompanies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
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

    public ArrayList<InsuranseCompanies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void setAcceptedInsuranses(ArrayList<InsuranseCompanies> acceptedInsuranses) {
        this.acceptedInsuranses = acceptedInsuranses;
    }



    public void printAll(){

        System.out.println("Hospital{" +
            "hospitalName='" + hospitalName);
        address.printAddress();
        printDoctors();
        printRooms();
        insInfo();}


 public void insInfo () {
        acceptedInsuranses.forEach((i) -> System.out.println(i));
 }

    public void printDoctors () {
        doctors.forEach(Doctor::getDoctor);
 }

 public void printRooms() {
     for (Map.Entry<Integer, String> entry : rooms.entrySet()) {
         System.out.println(entry.getKey() + " " + entry.getValue());

     }

 }}




