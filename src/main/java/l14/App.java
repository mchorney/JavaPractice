package l14;

import l13.States;

public class App {
    public static void main(String[] args) {
        Student peter = new Student("Peter","Johnson",1995,University.COLUMBUS,Subject.BIOLOGY);
        peter.myInfo();
        peter.introduce("Anna");

        Teacher mrJackson = new Teacher("James","Jackson", 1980, new University[]{University.COLUMBUS},Subject.MATH);
        mrJackson.introduce("Peter");


        Address homeAddress = new Address("12 Central Lane", "FarAwayTown", States.NJ,78900);
        Person houseOwner = new Person("Boris","Johnson",1960);
        CountryHouse countryHouse = new CountryHouse(homeAddress,5000,2,true,houseOwner,true);



        House house = new CountryHouse(homeAddress,5000,2,true,houseOwner,true);
        House house1 = new PrivateHouse(homeAddress,5000,2,true,houseOwner);
        PrivateHouse house2 = new CountryHouse(homeAddress,5000,2,true,houseOwner,true);

//        CountryHouse house3 = new House(homeAddress,5000,2,true);

    }

}
