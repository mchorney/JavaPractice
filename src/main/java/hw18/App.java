package hw18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {


        Address hospitalAddress = new Address("301 10TH ", "PHILADELPHIA", "PA", 19116);

        Doctors id1 = new Doctors("Tim", "Thomson", Position.CARDIOLOGIST);
        Doctors id2 = new Doctors("Sam", "Johnson", Position.DERMATOLOGIST);
        Doctors id3 = new Doctors("Bill", "Green", Position.PEDIATRICIAN);
        Doctors id4 = new Doctors("Duck", "Shnider", Position.PHYSICIAN);
        Doctors id5 = new Doctors("Ian", "Bezos", Position.CARDIOLOGIST);
        Doctors id6 = new Doctors("Arny", "Benson", Position.SURGEON);


        List<Doctors> doctors = new ArrayList<>();
        doctors.add(id1);doctors.add(id2);doctors.add(id3);
        doctors.add(id4);doctors.add(id5);doctors.add(id6);


        Map<Integer, String> listRooms = new HashMap<>();
        listRooms.put(204,"Room of PHYSICIAN");
        listRooms.put(201,"Room of PEDIATRICIAN");
        listRooms.put(205,"Room of CARDIOLOGIST");
        listRooms.put(208,"Room of DERMATOLOGIST");
        listRooms.put(203,"Room of SURGEON");

        List<InsuranceCompanies> iCompanies = new ArrayList<>();
        iCompanies.add(InsuranceCompanies.AETNA);
        iCompanies.add(InsuranceCompanies.KEYSTONE);
        iCompanies.add(InsuranceCompanies.CIGNA);
        iCompanies.add(InsuranceCompanies.UnitedHealthCare);
        iCompanies.add(InsuranceCompanies.BLUE_CROSS);


        for ( Doctors d : doctors) {
            System.out.println(d.getName()+" "+d.getLastName()+", "+d.getPosition()+"; ");
        }

        for ( Doctors d1 : doctors) {
            d1.printInfo();

        }

        for (Map.Entry r : listRooms.entrySet()) {
            System.out.println("Room # "+r.getKey()+", "+r.getValue()+";");

        }


       Hospitals hospital = new Hospitals("Jefferson Hospital",hospitalAddress,doctors,listRooms,iCompanies);


//
//        hospital.printInfo();
        hospital.getInsuranceCompanies();
        hospitalAddress.printAddress();
        System.out.println(iCompanies);






    }
}
