package homework15;

public class Work {
    public static void main(String[] args) {
//        Создайте интерфейс и 2 класса которые его имплементируют
//        Создайте по 2 объекта каждого класса типа Интерфейса

        Pet duke = new Dog("Duke",2);
        Pet buddy = new Dog("Buddy",5);
        Pet yoda = new Cat("Yoda",15);
        Pet lemon = new Cat("Lemon",2);

        duke.eat();
        duke.sleep();
        System.out.println("Dog says "+duke.voice());

        yoda.sleep();
        yoda.eat();
        System.out.println("Cat says "+yoda.voice());

        Pet[] pets ={duke,buddy,yoda,lemon};

    }
}
