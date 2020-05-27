package hw10;

public class Pet {
    public String name;
    public String type;
    public String word;
    public String color;
    public void voice(){
        System.out.println(type + " " + name + " said " + word);
    }
    public void sleep(){
        System.out.println(type + " " + name + " is sleeping now");
    }
    public void wakeUp(){
        System.out.println(type + " " + name + " woke up");
    }
}
