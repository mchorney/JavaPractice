package homework18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer,String> rooms;
    private List<InsuranseCompanies> acceptedInsuranses;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranseCompanies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public Map<Integer, String> getRooms() {
        return rooms;
    }

    public List<InsuranseCompanies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void printInfo(){
        System.out.println(hospitalName+", address: "+address.address()+"; Insurances "+acceptedInsuranses);
    }


    }

