package hw10;

public class Flower {
    public String sort;
    public String name;
    public String color;
    public int price;

    public void bouquet(){
        System.out.println("This composition consists of "+ color +" "+ name+" "+'"'+sort+'"'+" and the price is "+ price+".");
    }
}
