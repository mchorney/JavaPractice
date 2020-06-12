package homework_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

//Создайте класс Hospital
//Fields
//- private String hospitalName;
//- privare Address address;
//    (Класс Address
//    - private String streetAddress;
//    - private String town;
//    - private String state;
//    - private int zip;
//- private ArrayList<Doctor> doctors;
//    (Класс Doctor
//    - private String name;
//    - private String lastName;
//    - private Position position;
//        (Enum Position is a enum with 5 members - например Position.PHYSICIAN);
//- private HashMap<Integer,String> rooms; (список кабинетов и их название - пример комната 22 - Gastroenterology rooms.put(22,"Gastroenterology") )
//- private ArrayList<InsuranseCompamies> acceptedInsuranses; список принимаемых страховок.
//    (Enum InsuranseCompamies - enum of Insuranses,  например InsuranseCompamies.AETNA, InsuranseCompamies.UnitedHealthcare)
//Методы:
//- Вывести на печать название, адрес и список Иншурансов которые принимает больница - public void printInfo();
//- Вывести на печать список врачей и их должности - public void printDoctors();
//- Вывести на печать все кабинеты с номерами и их названиямиж
public class homework_18 {
    public static void main(String[] args) {
        ArrayList<InsuranseCompamies> insurance = new ArrayList<InsuranseCompamies>();
        insurance.add(InsuranseCompamies.AETNA);
        insurance.add(InsuranseCompamies.BLUE_CROSS);
        insurance.add(InsuranseCompamies.UnitedHealthcare);
        insurance.add(InsuranseCompamies.KAISER_PERMANENTE);

        HashMap<Integer,Position> rooms = new HashMap<Integer,Position>();
        rooms.put(22,Position.CARDIOLOGIST);
        rooms.put(23,Position.HYPNOTHERAPIST);
        rooms.put(24,Position.PHYSICIAN);
        rooms.put(25,Position.SURGEON);

        Doctors cardio = new Doctors("Ivan", "Ivanov", Position.CARDIOLOGIST);
        Doctors hypno = new Doctors("Petr", "Petrov", Position.HYPNOTHERAPIST);
        Doctors physician = new Doctors("Sidor", "Sidorov", Position.PHYSICIAN);
        Doctors surgeon = new Doctors("Semen", "Semenov", Position.SURGEON);

        ArrayList<Doctors> doctors = new ArrayList<Doctors>();
        doctors.add(cardio);
        doctors.add(hypno);
        doctors.add(physician);
        doctors.add(surgeon);

        Address penrose_address = new Address("2222 N Nevada Ave", "Colorado Springs", "CO", 80907);
        Hospital penrose_hospital = new Hospital("Penrose Hospital", penrose_address, doctors, rooms, insurance);

        penrose_hospital.printInsurances();
        penrose_hospital.printDoctors();
        penrose_hospital.printOffices();
    }
}
