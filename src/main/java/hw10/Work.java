package hw10;

public class Work {
    public static void main(String[] args){
        House home1 = new House();
        home1.address = "29 E Dry Creek, Aurora, CO 80012";
        home1.open();
        home1.status = "closed";
        home1.printStatus();
        House home2 = new House();
        home1.address = "111 Oak st, Denver, CO 80209";
        home1.close();
        home1.printStatus();
        //--------------------------
        Tvsony sonyLR = new Tvsony();
        sonyLR.name = "Living Room";
        sonyLR.turnOn();
        sonyLR.turnOff();
        Tvsony sonyFR = new Tvsony();
        sonyFR.name = "Family Room";
        sonyFR.turnOn();
        sonyFR.turnOff();
        //--------------------------
        Pet cat = new Pet();
        cat.name = "Murka";
        cat.type = "cat";
        cat.word = "Miau";
        cat.sleep();
        cat.wakeUp();
        cat.voice();
        cat.sleep();
        Pet dog = new Pet();
        dog.name = "Borbos";
        dog.type = "dog";
        dog.word = "gav";
        dog.sleep();
        dog.wakeUp();
        dog.voice();
        //-------------------------
        Tablet sam = new Tablet();
        sam.type = "S5";
        sam.name = "Samsung";
        sam.turnOn();

        Tablet apple = new Tablet();
        apple.name = "Iphone";
        apple.type = "S8";
        apple.turnOn();

        System.out.println("TV in " + sonyLR.name + " is " + sonyLR.status + " in home with address " + home1.address);

    }
}
