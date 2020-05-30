package hwk11;

public class House {
    private String size;
    private int numOfRooms;
    private double price;

    public House(){
    }

    public House(String size, int numOfRooms, double price){
        this.size=size;
        this.numOfRooms=numOfRooms;
        this.price=price;
    }

    public House(int numOfRooms, double price){
        this.numOfRooms=numOfRooms;
        this.price=price;
    }

    public double getPrice(){
        return this.price;
    }

    public int getNumOfRooms(){
        return this.numOfRooms;
    }

    public String getSize(){
        return size;
    }

    public void setNumOfRooms(int rooms){
        numOfRooms=rooms;
    }

    public void setPrice(double num){
        price=num;
    }

    public void setSize(String size){
        this.size=size;
    }

    public void printClass(){
        System.out.println("My house size is " + size + "\n" + "My house price is " + price + "\n" + "I have " + numOfRooms + " rooms.");
    }

}
