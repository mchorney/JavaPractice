package home18;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Adress adress=new Adress("4325 Palm BLVD","Orlando","FL",32743);

        ArrayList<InsuranseCompanies> insuranseCompanies=new ArrayList<>();
        insuranseCompanies.add(InsuranseCompanies.FLORIDABLUE);
        insuranseCompanies.add(InsuranseCompanies.MEDICADE);
        insuranseCompanies.add(InsuranseCompanies.STAYWELL);
        insuranseCompanies.add(InsuranseCompanies.UCARE);
        insuranseCompanies.add(InsuranseCompanies.STARCARE);

        Hospital hospital=new Hospital("Palm Hospital",adress,insuranseCompanies);
        hospital.printInsur();

        Doctor doctor1=new Doctor("Mark","Petriv",Position.THERAPIST);
        Doctor doctor2=new Doctor("Karen","Bol",Position.PEDIATRICIAN);
        Doctor doctor3=new Doctor("Sam","Klaim",Position.ENDOCRINOLOGIST);
        Doctor doctor4=new Doctor("Amanda","Hofman",Position.SURGEON);
        Doctor doctor5=new Doctor("Susi","Krew",Position.NEUROPATHOLOGIST);

        ArrayList<Doctor>doctors=new ArrayList<>();
        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        doctors.add(doctor5);
        for(Doctor v:doctors){
            v.printDoc();
        }




        HashMap<Integer,String>rooms=new HashMap<>();
        rooms.put(14,"cabinet of Therapist");
        rooms.put(26,"cabinet of Pediatrician");
        rooms.put(31,"cabinet of Endocrinologist");
        rooms.put(48,"cabinet of Surgeon");
        rooms.put(59,"cabinet of Neuropathologist");
//        System.out.println("Rooms: "+rooms);
        for(Integer k:rooms.keySet()){
            System.out.println(k);
            System.out.println(rooms.get(k));
        }




}}
