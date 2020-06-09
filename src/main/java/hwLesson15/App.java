package hwLesson15;

public class App {
    public static void main(String[] args){
        System.out.println("-----------------------1----------------------------");
        Food iceCream = new Food("Ice-Cream",true,10,15,2,DeliveryType.DOORDASH);
        iceCream.dimensions();
        iceCream.printDetails();
        System.out.println("-----------------------2----------------------------");
        Food cake = new Food("Cake",false,20,50,78,DeliveryType.DOORDASH);
        cake.dimensions();
        cake.typeOfDelivery(78);
        cake.printDetails();
        System.out.println("------------------------3---------------------------");
        Clothes pans = new Clothes("Pens",5,10,2,DeliveryType.PRIORITY_MAIL);
        pans.dimensions();
        pans.printDetails();
        System.out.println("------------------------4---------------------------");
        Clothes skirt = new Clothes("Skirt", 2,2,1,DeliveryType.FIRST_CLASS);
        skirt.dimensions();
        skirt.typeOfDelivery(1);
        skirt.printDetails();


    }
}
