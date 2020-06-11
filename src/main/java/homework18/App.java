package homework18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Address hospitalAddress=new Address("4700 Alliance Blvd", "Plano", "Texas", 75093);
        Doctor psp=new Doctor("Mary", "Johnson", Position.PCP);
        Doctor cardio=new Doctor("Steven","Sokolyk", Position.CARDIOLOGIST);
        Doctor allergy=new Doctor("Lisa", "Jackobs", Position.ALLERGIST);
        ArrayList<Doctor> docs=new ArrayList<>();
        docs.add(psp);
        docs.add(cardio);
        docs.add(allergy);
        HashMap<Integer,String> rooms=new HashMap<>();
        rooms.put(12,"Cardiology");
        rooms.put(15, "Allergy and Immunology");
        rooms.put(23, "Dermatology");
        rooms.put(27,"Anesthesiology");
        rooms.put(33,"PCP");
        ArrayList<InsuranseCompanies> insur=new ArrayList<>(Arrays.asList(InsuranseCompanies.MOLINA,InsuranseCompanies.BLUECROSS,InsuranseCompanies.CAREFIRST,InsuranseCompanies.METROPOLITAN,InsuranseCompanies.WELLCARE));
        Hospital baylor=new Hospital("Baylor Scott Medical Center", hospitalAddress, docs,rooms,insur);
   baylor.printInfo();
   psp.printDoctors();
   cardio.printDoctors();
   allergy.printDoctors();
        System.out.println(rooms);
        System.out.println(docs);
    }
}
