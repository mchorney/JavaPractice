package hwlesson10;

public class App {
    public static void main(String[]args){
        Computer  dell = new Computer();
        dell.brand = "Dell";
        dell.hd = "500 Gb";
        dell.memory = "16" ;
        dell.price = "$500";

        Computer mac = new Computer();
        mac.brand = "Mac";
        mac.hd = "450 Gb";
        mac.memory ="8";
        mac.price = "$900";


        Computer sony = new Computer();
        sony.brand ="Sony";
        sony.hd = "1 Tb";
        sony.memory = "16";
        sony.price = "$800";

        dell.printMe();
        mac.printMe();
        sony.printMe();
        // Second Class
        Headphones beats = new Headphones();
        beats.brand = "Beats";
        beats.color = "White";
        beats.model = "series2";
        beats.price = 300;


        Headphones bose = new Headphones();
        bose.brand = "Bose";
        bose.model = "QC 35";
        bose.color ="Silver";
        bose.price = 350;

        bose.printMe();
        beats.printMe();
        // Third Class
        House firstHouse = new House();
        firstHouse.zipCode = "92127";
        firstHouse.sqrfeet = 1000;
        firstHouse.numRooms =2;
        firstHouse.price = 500000;


        House secondHouse = new House();
        secondHouse.zipCode = "92128";
        secondHouse.sqrfeet = 2000;
        secondHouse.numRooms =4.5;
        secondHouse.price = 700000;

        firstHouse.printMe();
        secondHouse.printMe();
        // Forth Class
        Stove whirlpool = new Stove();
        whirlpool.color = "Gray";
        whirlpool.brand = "Whirlpool";
        whirlpool.numFlames = 5;
        whirlpool.price = 500;

        Stove samsung = new Stove();
        samsung.color = "White";
        samsung.numFlames = 4;
        samsung.price = 200;

        whirlpool.printMe();
        samsung.printMe();

    }
}
