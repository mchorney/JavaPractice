package lesson11hw10;

public class App {
    public static void main(String[] args) {
        String[] placeOforigin = {"Europe"};
        Barries goosebarry = new Barries("goosebarry", placeOforigin, "Green");
        Barries raspbarry = new Barries("raspbarry", placeOforigin, "Red");
        goosebarry.printClass();
        raspbarry.printClass();


        String[] banks = {"Chase"};
        creditcard visa = new creditcard(banks, "Visa", 2022);
        creditcard mastercard = new creditcard(new String[]{"TD"}, "Master Card", 2023);
        visa.printClass();
        mastercard.printClass();

        String[] names = {"iPhone X"};
        String nametoo = ("X9");
        Mobilephones Apple = new Mobilephones(names,"Apple",2019);
        Mobilephones Samsung = new Mobilephones(new String[]{"X9"},"Samsung",2018);
        Apple.printClass();
        Samsung.printClass();

    }
}
