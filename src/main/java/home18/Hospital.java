package home18;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private String hospitalName;
    private Adress adress;
    private ArrayList<Doctor>doctors;
    private HashMap<Integer,String>rooms;
    private ArrayList<InsuranseCompanies>insuranseCompanies;

    public Hospital(String hospitalName, Adress adress, ArrayList<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranseCompanies> insuranseCompanies) {
        this.hospitalName = hospitalName;
        this.adress = adress;
        this.doctors = doctors;
        this.rooms = rooms;
        this.insuranseCompanies = insuranseCompanies;
    }
    public Hospital(String hospitalName,Adress adress,ArrayList<InsuranseCompanies>insuranseCompanies){
        this.hospitalName=hospitalName;
        this.adress=adress;
        this.insuranseCompanies=insuranseCompanies;
    }


    public Hospital() {
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
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

    public ArrayList<InsuranseCompanies> getInsuranseCompanies() {
        return insuranseCompanies;
    }

    public void setInsuranseCompanies(ArrayList<InsuranseCompanies> insuranseCompanies) {
        this.insuranseCompanies = insuranseCompanies;

    }
    public void printInfo() {
        System.out.println("Hospital{" +
                "hospitalName='" + hospitalName +
                ", adress=" + adress +
                ", insuranseCompanies=" + insuranseCompanies +
                '}');
    }


    public void printInsur() {
        System.out.println( "Hospital name"+hospitalName);
        adress.printAddress();
        System.out.println("Incsurance accepted in hospital are "+insuranseCompanies);
    }

}
