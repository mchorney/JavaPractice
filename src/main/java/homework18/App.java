package homework18;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Address hospitalAddress=new Address("4700 Alliance Blvd", "Plano", "Texas", 75093);
        Doctor psp=new Doctor("Mary", "Johnson", Position.PCP);
        Doctor cardio=new Doctor("Steven","Sokolyk", Position.CARDIOLOGIST);
        Doctor allergy=new Doctor("Lisa", "Jackobs", Position.ALLERGIST);
        List<Doctor> docs=new ArrayList<>();
        docs.add(psp);
        docs.add(cardio);
        docs.add(allergy);
        Map<Integer,String> rooms=new HashMap<>();
        rooms.put(12,"Cardiology");
        rooms.put(15, "Allergy and Immunology");
        rooms.put(23, "Dermatology");
        rooms.put(27,"Anesthesiology");
        rooms.put(33,"PCP");
        List<InsuranseCompanies> insur=new ArrayList<>(Arrays.asList(InsuranseCompanies.MOLINA,InsuranseCompanies.BLUECROSS,InsuranseCompanies.CAREFIRST,InsuranseCompanies.METROPOLITAN,InsuranseCompanies.WELLCARE));
        Hospital baylor=new Hospital("Baylor Scott Medical Center", hospitalAddress, docs,rooms,insur);
   baylor.printInfo();
   psp.printDoctors();
   cardio.printDoctors();
   allergy.printDoctors();
        System.out.println(rooms);
        for (Doctor d:docs) {
            System.out.println(d.getName()+" "+d.getLastName()+" - "+d.getPosition());
        }
    }
}
