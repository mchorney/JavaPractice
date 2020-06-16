package homework18;

import javax.print.Doc;
import java.util.*;

public class Work {
    public static void main(String[] args) {
        Address address = new Address("2331 Savannah hills dr","Charlotte","NC",28105);

        Doctor john = new Doctor("John","White",Position.Phisician);
        Doctor sam = new Doctor ("Samuel","Black",Position.Dental);
        Doctor dave = new Doctor ("David","Morrison",Position.Pediatric);
        List doctors = new ArrayList<>();
        doctors.add(john);
        doctors.add(sam);
        doctors.add(dave);


       Map<Integer,String> rooms = new HashMap<>();
       rooms.put(22,"Physician room");
       rooms.put(33,"Dental room");
       rooms.put(44,"Gastro room");
       rooms.put(55,"Plastic room");
       rooms.put(11,"Pediatric room");


       List insuranceCompanies = new ArrayList();
       insuranceCompanies.add (Insuranse.Aetna);
       insuranceCompanies.add (Insuranse.Atrium);
       insuranceCompanies.add (Insuranse.BlueCross);

       Hospital bolnica = new Hospital("St.Patrick",address,doctors,rooms,insuranceCompanies);

       bolnica.roomInfo();
       bolnica.printInfo();
       bolnica.printDoctors();






    }
}
