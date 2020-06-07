package hw18;

/*
Создайте класс Hospital.
- Вывести на печать название, адрес и список Иншурансов которые принимает больница - public void printInfo();
- Вывести на печать список врачей и их должности - public void printDoctors();
- Вывести на печать все кабинеты с номерами и их названиями
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        Address metropolitanAddress = new Address("12 Oak St", "Los Angeles", "CA", 90056);
        ArrayList<InsuranceCompanies> listOfIncurances = new ArrayList<>();
        Collections.addAll(listOfIncurances, InsuranceCompanies.AETNA, InsuranceCompanies.UNITED_HEALTHCARE);
        Hospital metropolitan = new Hospital("Metropolitan", metropolitanAddress, listOfIncurances);
        metropolitan.printInfo();

        Doctor physician = new Doctor("Bella", "Smith", Position.PHYSICIAN);
        Doctor cardiologyst = new Doctor("Benjamin", "Johnson", Position.CARDIOLOGIST);
        Doctor nephrologyst = new Doctor("Timothy", "Brasberg", Position.NEPHROLOGIST);
        Doctor gastroenterologyst = new Doctor("Matthew", "Peterson", Position.GASTROENTEROLOGIST);
        Doctor otolaryngologyst = new Doctor("Samantha", "Miller", Position.OTOLARYNGOLOGIST);
        ArrayList<Doctor> listOfDoctors = new ArrayList<>();
        Collections.addAll(listOfDoctors, physician, cardiologyst, nephrologyst, gastroenterologyst, otolaryngologyst);
        for (Doctor v: listOfDoctors) {
            v.printDoctors();
        }

        HashMap<Integer, String> rooms = new HashMap<>();
        rooms.put(1, "Physicians");
        rooms.put(2, "Cardiology");
        rooms.put(3, "Nephrology");
        rooms.put(4, "Gastroenterology");
        rooms.put(5, "Otolaryngology");
        System.out.println("Rooms: " + rooms);
    }
}
