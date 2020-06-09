package hwk18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors;
    private HashMap<Integer,String> rooms; //(список кабинетов и их название - пример комната 22 - Gastroenterology rooms.put(22,"Gastroenterology") )
    private ArrayList<InsuranceCompanies> acceptedInsurances;

    public Hospital(String hospitalName, Address address, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranceCompanies> acceptedInsurances) {
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

    public ArrayList<InsuranceCompanies> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public void setAcceptedInsurances(ArrayList<InsuranceCompanies> acceptedInsurances) {
        this.acceptedInsurances = acceptedInsurances;
    }

    public void printInfo(){
        System.out.println("HOSPITAL INFO \nName: " + hospitalName + "; Address: " + address.getAddress() + "; accepted insurance: " );
        acceptedInsurances.forEach(System.out::println);
    }

    public void printDoctors(){
        System.out.println("HOSPITAL DOCTORS");
        doctors.forEach(doctor -> System.out.println(doctor.getFullName() + " : " + doctor.getPosition()));
    }

    public void printRooms(){
        System.out.println("HOSPITAL ROOMS");
        rooms.forEach((room, name) -> System.out.println(room + " : " + name));
    }



}
