package hw13;

public class Keyboard {
    private KeyboardBrand keyboardBrand;
    private DeviceColor deviceColor;
    private int year;

    public Keyboard(KeyboardBrand keyboardBrand, DeviceColor deviceColor, int year) {
        this.keyboardBrand = keyboardBrand;
        this.deviceColor = deviceColor;
        this.year = year;
    }
    public void printInfo(){
        System.out.println("Keeboard brand: "+keyboardBrand+" Color: "+ deviceColor+" Production year: "+year);
    }
}
