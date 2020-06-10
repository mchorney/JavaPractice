package h10;

public class App {
    public static void main(String[] args) {
        Phone motorola = new Phone();
        motorola.name="MOTOROLA";
        motorola.model="Moto G Power";
        motorola.year=2020;
        motorola.printMe();

        Phone nokia = new Phone();
        nokia.name="NOKIA";
        nokia.model="3310";
        nokia.year=2002;
        nokia.printMe();

        Camera nikon = new Camera();
        nikon.name="Nikon";
        nikon.model="D800";
        nikon.price=200000;
        nikon.printMe();

        Camera leica = new Camera();
        leica.name="LEICA";
        leica.model="SL-System";
        leica.price=250000;
        leica.printMe();

        Lens canon = new Lens();
        canon.model="EF";
        canon.zoom="24-70mm";
        canon.diaphragm="f/2.8L";
        canon.price=199000;
        canon.printMe();

        Lens sony = new Lens();
        sony.model="E";
        sony.zoom="16-55mm";
        sony.diaphragm="f/2.8G";
        sony.price=180000;
        sony.printMe();

        TV samsung = new TV();
        samsung.brand="SAMSUNG";
        samsung.series="Series 7";
        samsung.screen="50 inch";
        samsung.price=40000;
        samsung.printMe();

        TV lg = new TV();
        lg.brand="LG";
        lg.series="Ultra HD 7-series";
        lg.screen="55 inch";
        lg.price=35000;
        lg.printMe();

    }
}
