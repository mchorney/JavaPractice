package hw10;

public class App {
    public static void main(String[] args) {
//        "Car"
        Car kia = new Car();
        Car bmw = new Car();

        kia.brand = "Kia";
        kia.model = "Sportage";
        kia.type = "SUV";
        kia.color = "Grey";
        kia.year = 2018;
        kia.mileage = 50100;

        System.out.println(kia.brand);
        System.out.println(kia.model);
        System.out.println(kia.type);
        System.out.println(kia.color);
        System.out.println(kia.year);
        System.out.println(kia.mileage);
        kia.printIt();
        kia.life();

        kia = bmw;
        System.out.println(bmw.model);


//        Car bmw = new Car();
//        bmw.brand = "BMW";
//        bmw.model = "3 series";
//        bmw.type = "Sedan";
//        bmw.color = "White";
//        bmw.year = 2021;
//        bmw.mileage = 5300;
//
//        System.out.println(bmw.brand);
//        System.out.println(bmw.model);
//        System.out.println(bmw.type);
//        System.out.println(bmw.color);
//        System.out.println(bmw.year);
//        System.out.println(bmw.type);
//        System.out.println(bmw.mileage);
//        bmw.printIt();

//        "City"
        City seattle = new City();
        seattle.name = "Seattle";
        seattle.location = "PNW";
        seattle.population = 744955;
        seattle.amount_of_rainy_days = 150;

//        System.out.println(seattle.name);
//        System.out.println(seattle.location);
//        System.out.println(seattle.population);
//        System.out.println(seattle.amount_of_rainy_days);
        seattle.printIt();
        seattle.story();

        City minsk = new City();
        minsk.name = "Minsk";
        minsk.location = "Belarus";
        minsk.population = 1975000;
        minsk.amount_of_rainy_days = 195;

//        System.out.println(minsk.name);
//        System.out.println(minsk.location);
//        System.out.println(minsk.population);
//        System.out.println(minsk.amount_of_rainy_days);
        minsk.printIt();

//        "Smartphone"

        Smartphone iphone = new Smartphone();
        iphone.brand = "Iphone";
        iphone.model = "XS Max";
        iphone.color = "Black";
        iphone.OS = "IOS 13.4.1";
        iphone.size = 6.1;

//        System.out.println(iphone.brand);
//        System.out.println(iphone.model);
//        System.out.println(iphone.color);
//        System.out.println(iphone.size);
//        System.out.println(iphone.size);
        iphone.printIt();
        iphone.usage();

        Smartphone samsung = new Smartphone();
        samsung.brand = "Samsung";
        samsung.model = "Galaxy";
        samsung.color = "Blue";
        samsung.OS = "Android 10";
        samsung.size = 5.4;

//        System.out.println(samsung.brand);
//        System.out.println(samsung.model);
//        System.out.println(samsung.color);
//        System.out.println(samsung.size);
//        System.out.println(samsung.size);
        samsung.printIt();

//        "Shopping Cart"

        Shopping_card krivoy = new Shopping_card();
        krivoy.name_of_store = "Walmart";
        krivoy.number_of_products = 13;
        krivoy.total_price = "125 $" ;
        krivoy.size = "Medium";

//        System.out.println(krivoy.name_of_store);
//        System.out.println(krivoy.number_of_products);
//        System.out.println(krivoy.total_price);
//        System.out.println(krivoy.size);
        krivoy.printIt();

        Shopping_card web = new Shopping_card();
        web.name_of_store = "Amazon";
        web.number_of_products = 1;
        web.total_price = "32 $" ;
        web.size = "Unlimited";

//        System.out.println(web.name_of_store);
//        System.out.println(web.number_of_products);
//        System.out.println(web.total_price);
//        System.out.println(web.size);
        web.printIt();
        web.shopping();






    }
}
