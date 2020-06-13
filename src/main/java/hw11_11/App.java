package hw11_11;

public class App {

    public static void main(String[] args) {
        String[] owners = {"John","Jack"};
        Dog doggy = new Dog(owners,"Doggy");
        Dog fiona = new Dog(new String[]{"Michelle"},"Fiona");

        Dog mimi = new Dog();
        mimi.setName("Mimi");
        mimi.setOwners(new String[]{"Denis"});
        doggy.printMe();
        fiona.printMe();
        mimi.printMe();
    }
}
