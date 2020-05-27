package hw10;

public class Tvsony {
    public String name;
    public String status;
    public void turnOn(){
        System.out.println("TV in " + name + " is turned on");
        status = "on";
    }
    public void turnOff(){
        System.out.println("TV in " + name + " is turned off");
        status = "off";
    }

}
