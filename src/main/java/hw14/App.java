package hw14;

public class App {
    public static void main(String[] args) {
        Customer Rahul = new Customer("Rahul", "Reddy", Insurances.YES, PayMethods.FINANCING);
        Customer Ana = new Customer("Ana", "Katsal", Insurances.YES, PayMethods.DEBIT);
        Customer Victor = new Customer("Victor", "Ryzhin", Insurances.NO, PayMethods.CASH);

        Ana.introduce("Peter");

        Car kiasportage = new Car(Brands.KIA, "Sportage", Years.Y2018);
        Car merc = new Car(Brands.MERCEDES, "CLC300", Years.Y2020);

        merc.printOut();

        CarDealer kiaofpyallup = new CarDealer("Rahul", "Reddy", Insurances.YES, PayMethods.FINANCING,"Kia of Puallyp", "Renton", "8am-7pm", kiasportage);
        CarService brokencar = new CarService("Ana", "Katsal", Insurances.YES, PayMethods.DEBIT, "Fast Mercedes", "Bellevue", "8am-9pm",merc, "engine noize");

        kiaofpyallup.myInfo();
        brokencar.myInfo();


    }
}
