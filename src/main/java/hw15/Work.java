package hw15;

import hw12_Enums.TypesOfCoffee;

public class Work {
    public static void main(String[] args) {
        Beverage latte = new Coffee(TypesOfCoffee.LATTE, 170, false, TypesOfMilk.REGULAR);
        latte.tempOfBev();
        latte.alcoAndAge();
        System.out.println("Ice = "+latte.ice());
        System.out.println("Lactose = "+latte.lactose());
        latte.printInfo();
        System.out.println("----------------------------------------------");

        Beverage espressoWithWhiskey = new Coffee(TypesOfCoffee.ESPRESSO,160,true,TypesOfMilk.NONE);
        espressoWithWhiskey.tempOfBev();
        espressoWithWhiskey.alcoAndAge();
        System.out.println("Ice = "+espressoWithWhiskey.ice());
        System.out.println("Lactose = "+espressoWithWhiskey.lactose());
        espressoWithWhiskey.printInfo();
        System.out.println("----------------------------------------------");

        Beverage drpepper = new SoftDrinks("Dr.Pepper Cherry",true, true, false,TypesOfMilk.NONE);
        drpepper.printInfo();
        System.out.println("Ice = "+drpepper.ice());
        drpepper.alcoAndAge();
        drpepper.tempOfBev();
        System.out.println("----------------------------------------------");

        Beverage lemonade = new SoftDrinks("Lemonade",false,false,false,TypesOfMilk.NONE);
        lemonade.printInfo();
        System.out.println("Ice = "+lemonade.ice());
        System.out.println("Lactose = "+lemonade.lactose());
        lemonade.alcoAndAge();
        lemonade.tempOfBev();


    }
}
