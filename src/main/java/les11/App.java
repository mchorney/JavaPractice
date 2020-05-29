package les11;

public class App {
    public static void main(String[] args) {
        Person olha =new Person();
        olha.name="Olha";
        olha.lastName="Obertas";
        olha.year=1998;

        olha.printOut();

        Person peter=new Person("Peter","Jackobson",1990);
        peter.printOut();

        Dog sharik = new Dog("Sharik","Dvorterier",3);
        sharik.printOut();

        Dog mimi=new Dog();
        mimi.printOut();

        Cat cat=new Cat("Cat");

        Car mazda=new Car("Mazda","CX7",2020);
        mazda.setYear(2023);
        System.out.println(mazda.toString());



    }
}
