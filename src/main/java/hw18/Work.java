package hw18;

import hw16.Drinks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Work {
    public static void main(String[] args) {
//        public class Hospital {
//            private String hospitalName;
//            private Address address;
//            private ArrayList<Doctor> doctors;
//            *private HashMap<Integer,String> rooms;
//           *private ArrayList<InsuranseCompamies> acceptedInsuranses;

//        public class Doctor {
//            private String name;
//            private String lastName;
//            private Position position;

//        public class Address {
//            private String streetAddress;
//            private String town;
//            private String state;
//            private int zip;

//------------------------------------
        HashMap<Integer, String> listRooms = new HashMap<>();
        listRooms.put(202, "Room of PHYSICIAN");
        listRooms.put(101,"Room of PEDIATRICIAN");
        listRooms.put(105,"Room of CARDIOLOGIST");
        listRooms.put(208,"Room of DERMATOLOGIST");
        listRooms.put(303,"Room of IMP");
//-------------------------------------
        Address ad1 = new Address("101 Hospital St", "Denver", "CO", 80209);
//        Address ad2 = new Address("102 Maple St", "Aurora", "CO", 80011);
//        Address ad3 = new Address("103 Oak Dr", "Englewood", "CO", 80111);
//        Address ad4 = new Address("104 Monster Cir", "Denver", "CO", 80204);
//        Address ad5 = new Address("105 Main St", "Lone Tree", "CO", 80121);
//        Address ad6 = new Address("106 7th Ave", "Lakewood", "CO", 80433);
//        Address ad7 = new Address("107 Doctor St", "Denver", "CO", 80377);
//-------------------------------
        Doctor d1 = new Doctor("Jhon", "Jhonson", Position.CARDIOLOGIST);
        Doctor d2 = new Doctor("Ivan", "Ivonov", Position.DERMATOLOGIST);
        Doctor d3 = new Doctor("Pete", "Smith", Position.IMP);
        Doctor d4 = new Doctor("Kate", "Jhonson", Position.PHYSICIAN);
        Doctor d5 = new Doctor("Sam", "McDonald", Position.IMP);
        Doctor d6 = new Doctor("Kim", "Ivanova", Position.CARDIOLOGIST);
        Doctor d7 = new Doctor("Alex", "Vrach", Position.PEDIATRICIAN);
        Doctor d8 = new Doctor("Jhonnie", "Jhonson", Position.IMP);
//-----------------------------
//        public class Hospital {
//            private String hospitalName;
//            *private Address address;
//            *private ArrayList<Doctor> doctors;
//            *private HashMap<Integer,String> rooms;
//           *private ArrayList<InsuranseCompamies> acceptedInsuranses;
        List<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(d1);doctors.add(d2);doctors.add(d3);doctors.add(d4);
        doctors.add(d5);doctors.add(d6);doctors.add(d7);doctors.add(d8);
//---------------------------------
        ArrayList<InsuranseCompamies> iCompamies = new ArrayList<InsuranseCompamies>();
        iCompamies.add(InsuranseCompamies.ALLSTATE);
        iCompamies.add(InsuranseCompamies.NEYYORKLIFE);
        iCompamies.add(InsuranseCompamies.PROGRESSIVE);
        iCompamies.add(InsuranseCompamies.GEICO);
        iCompamies.add(InsuranseCompamies.AIG);



        String hospitalName = "Denver Public Hospital";
        Hospital newHospital = new Hospital(hospitalName, ad1, doctors, listRooms, iCompamies);

        newHospital.printInfo();
        System.out.println("-");
        newHospital.printDoctors();
        System.out.println("-");
        newHospital.printRooms();
        System.out.println("-");





    }
}
