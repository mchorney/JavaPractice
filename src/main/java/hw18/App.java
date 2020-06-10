package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {


        ArrayList<Doctor> doctorList = new ArrayList<>();
        Doctor bing = new Doctor("Chandler", "Bing", Position.PHYSICIAN);
        Doctor triviani = new Doctor("Joey", "Triviani", Position.PEDIATRICIAN);
        Doctor buffey = new Doctor("Phoebey", "Buffey", Position.NURSE);
        Doctor gellar = new Doctor("Monica", "Gellar", Position.SURGEON);
        Doctor smith = new Doctor("Ross", "Smith", Position.TRAUMATOLOGIST);

        doctorList.add(bing);
        doctorList.add(triviani);
        doctorList.add(buffey);
        doctorList.add(gellar);
        doctorList.add(smith);


        ArrayList<InsuranseCompanies>ins = new ArrayList<>();
        ins.add(InsuranseCompanies.AETNA);
        ins.add(InsuranseCompanies.FLORIDABLUE);
        ins.add(InsuranseCompanies.MEDICARE);
        ins.add(InsuranseCompanies.UNITEDHEALTHCARE);





        Address stLuisHospitalAddress = new Address ("2000 Crosshair str", "Orlando","Fl", 12345 );


        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(5, "Physician Room");
        rooms.put(15, "Pediatrician Room");
        rooms.put(25, "Nurse room");
        rooms.put(35, "Surgeon room");
        rooms.put(45, "Traumatologist room");

        for (Map.Entry<Integer, String> entry : rooms.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());


        Hospital hospital_One = new Hospital("St.luis", stLuisHospitalAddress, doctorList, rooms, ins);

        hospital_One.printAll();
        hospital_One.printDoctors();
        hospital_One.insInfo();
        stLuisHospitalAddress.printAddress();






       }


    }}







