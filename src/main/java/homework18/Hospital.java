package homework18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer,String> rooms;
    private ArrayList<Insuranse> acceptedInsurances;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<Insuranse> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
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

    public ArrayList<Insuranse> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public void setAcceptedInsurances(ArrayList<Insuranse> acceptedInsurances) {
        this.acceptedInsurances = acceptedInsurances;
    }



    public void printInfo(){
        System.out.println("Hospital name: " + getHospitalName());
        System.out.println("Hospital address: " + address.addressInfo());
        System.out.println("Acceptable insurances" + getAcceptedInsurances());
    }

    public void printDoctors(){
        System.out.println("Partition doctors:");
        doctors.forEach(doctor -> System.out.println(doctor.doctorInfo()));
    }

    public void roomInfo(){
        System.out.println("Rooms info:");
        rooms.forEach((room, name) -> System.out.println("Room: " + room + "-" + name));
    }

}
