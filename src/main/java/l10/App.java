package l10;

import java.util.Calendar;

public class App {
    public static void main(String[] args) {

        Name neo = new Name();
        neo.firstName = "Thomas";
        neo.lastName = "Anderson";
        neo.fullName();
        neo.greatings();
        System.out.println(neo.matrix());

        Name smith = new Name();
        smith.firstName = "Agent";
        smith.lastName = "Smith";
        smith.fullName();
        smith.greatings();
        System.out.println(smith.matrix());

        Profession worker1 = new Profession();
        worker1.job = "Accountant";
        worker1.hours = 80;
        worker1.hourSalary = 18;
        worker1.info();
        worker1.yearSalary();

        Profession worker2 = new Profession();
        worker2.job = "Accountant";
        worker2.hours = 20;
        worker2.hourSalary = 120;
        worker2.info();
        worker2.yearSalary();

        Hobby hobby1 = new Hobby();
        hobby1.hobby = "soccer";
        hobby1.hours = 4.5;
        hobby1.info();
        hobby1.hours = 9.5;
        hobby1.info();

        Hobby hobby2 = new Hobby();
        hobby2.hobby = "football";
        hobby2.hours = 3;
        hobby2.info();
        hobby2.hours = 22;
        hobby2.info();

        Animals dog = new Animals();
        dog.name = "Ivan";
        dog.type = "Cur";
        dog.age = 12;
        dog.info();
        System.out.println(dog.ageCheck());

        Animals pig = new Animals();
        pig.name = "Marysia";
        pig.type = "Stinky";
        pig.age = 6;
        pig.info();
        System.out.println(pig.ageCheck());

        Animals cat = new Animals();
        cat.name = "Cat";
        cat.type = "Gorges";
        cat.age = 3;
        cat.info();
        System.out.println(cat.ageCheck());
    }
}
