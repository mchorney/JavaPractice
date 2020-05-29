package hw11;

public class Work {
    public static void main(String[] args) {
        int[] pass1 = {1, 2, 3, 4, 5};
        int[] pass2 = {4, 7, 6, 1};
        House house1 = new House("22 E Dry", "TownHome", pass1);
        System.out.println(house1.printClass());
        House house2 = new House();
        house2.setAddress("33 E Creek");
        house2.setPassOpen(pass2);
        house2.setType("One Family Home");
        System.out.println("Second printClass function:");
        house2.printClass1();
        //-----------------------------
        System.out.println("----------------");
        String[] add1 = {"mustache","legs","tail"};
        String[] add2 = {"legs","tail"};
        Pet cat = new Pet("Matroskin", "cat", add1);
        System.out.println(cat.printClass());
        Pet dog = new Pet();
        dog.setName("Sharik ");
        dog.setAdditions(add2);
        dog.setType("dog");
        System.out.println("Second printClass function:");
        dog.printClass1();
        //-----------------------------
        System.out.println("------------------");
        String[] country2 = {"Italy","USA","Belarus"};
        String[] country1 = {"Spain","Usa"};
        Person person1 = new Person("Ivan Ivanov", "SDE", country1);
        System.out.println(person1.printClass());
        Person person2 = new Person();
        person2.setName("Sergei");
        person2.setCountry(country2);
        person2.setOccupation("SDET");
        System.out.println("Second printClass function:");
        person2.printClass1();



    }
}