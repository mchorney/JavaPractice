package homework18;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<InsuranceCompanies> acceptedInsuranses = new ArrayList<>();
        acceptedInsuranses.add(InsuranceCompanies.AETNA);
        acceptedInsuranses.add(InsuranceCompanies.CIGNA);
        acceptedInsuranses.add(InsuranceCompanies.KAISERFOUNDATION);
        acceptedInsuranses.add(InsuranceCompanies.PREMIERABLUECROSS);
        acceptedInsuranses.add(InsuranceCompanies.UNITEDHEALTH);

        Address hospital_address = new Address("1035 116th Ave NE", "Bellevue", "WA", 98004);

        Hospital OverlakeHospital = new Hospital("Overlake Hispital", hospital_address, acceptedInsuranses);
        OverlakeHospital.printInfo();



    }





    public void printDoctors(){

    }
    public void printDoctorsRooms() {

    }
}

