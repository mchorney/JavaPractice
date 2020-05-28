package hw10;

public class App {
    public static void main(String[] args) {

        Customer andrey = new Customer();
        andrey.name="Andrey";
        andrey.lastName="Andreev";
        andrey.age=32;

        andrey.customerInfo();


        Customer elena = new Customer();
        elena.name="Elena";
        elena.lastName="Cambell";
        elena.age=28;

        elena.hello();


        TV toshiba = new TV();
        toshiba.brand = "Toshiba";
        toshiba.model="TT55";
        toshiba.size= 55 ;

        toshiba.tvOn();
        toshiba.tvOff();

        TV samsung = new TV();
        samsung.brand = "Samsung";
        samsung.model = "TS65";
        samsung.size = 65;

        samsung.tvOn();
        samsung.tvOff();



        Phone iphone = new Phone();
        iphone.brand = "Apple";
        iphone.model = "Iphone 11";
        iphone.memorySize = 128;

        iphone.best_for_teens();

        Phone motorola = new Phone();
        motorola.brand = "Motorola";
        motorola.model = "supra e5";
        motorola.memorySize = 64;

        motorola.best_for_seniors();

    }
}



/*
1. Создайте 4 класса в которых есть поля (fields) и методы (methods)
        2. В классе App создайте функцию main() и создайте в ней по 2 объекта каждого класса - покажите как они работают*/
