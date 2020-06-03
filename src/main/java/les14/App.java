package les14;

import les13.Address;
import les13.States;

public class App {
    public static void main(String[] args) {
        Student peter = new Student("Peter",
                "Johnson", 1995,University.COLOMBUS,Subject.BIOLOGY);
        peter.myInfo();
        peter.intro("Anna");

        Teacher mrJackson = new Teacher("James","Jackson",
                1980,new University[]{University.COLOMBUS,
        University.NYU},Subject.MATH);
        mrJackson.intro("Peter");

        Address homeAddress =new Address("12 Central Ln",
                "FarAway", States.AZ,76859);
        Person owner=new Person("Olha","Obertas",1998);
        CountryHouse countryHouse=new CountryHouse(homeAddress,
                5000,2,true,owner,true);
        countryHouse.printMe();
    }
}
