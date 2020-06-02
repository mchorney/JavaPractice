package hwk12;

public class App {
    public static void main(String[] args) {
        Car myCar = new Car(CarType.AUDI, "Q3", 2020);
        myCar.setPreviousCars(new CarType[]{CarType.KIA, CarType.BMW, CarType.FORD});
        myCar.getPreviousCars();


        Dog myDog = new Dog(2, DogBreed.GOLDEN_DOODLE);
        System.out.println(myDog.getName());
        myDog.setName("Roxie");
        System.out.println(myDog.getName());

    }
}
