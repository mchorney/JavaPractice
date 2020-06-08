package homework_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private ArrayList<Doctors> doctors;
    private HashMap<Integer,Position> rooms;
    private ArrayList<InsuranseCompamies> acceptedInsuranses;

    public Hospital(String hospitalName, Address address, ArrayList<Doctors> doctors, HashMap<Integer, Position> rooms, ArrayList<InsuranseCompamies> acceptedInsuranses) {
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

    public ArrayList<Doctors> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctors> doctors) {
        this.doctors = doctors;
    }

    public HashMap<Integer, Position> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Integer, Position> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<InsuranseCompamies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void setAcceptedInsuranses(ArrayList<InsuranseCompamies> acceptedInsuranses) {
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public void printInsurances(){
        System.out.println(hospitalName + " " + address.toString() + " Accepts insurances: " +acceptedInsuranses);
    }

    public void printDoctors(){
//        System.out.println(Arrays.toString(doctors.toArray()));
        for(Doctors d : doctors){
            System.out.println(d);
        }

    }

    public void printOffices(){
        for(Map.Entry<Integer,Position> entry : rooms.entrySet()){
            System.out.println("Room " +entry.getKey() + " is "+entry.getValue());
        }
    }
}
