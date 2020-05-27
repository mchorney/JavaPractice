package hw10;

public class House {
    public String address;
    public String status;
    public void open(){
        status = "opened";
        System.out.println(address + " " + status);
    }
    public void close(){
        status = "closed";
        System.out.println(address + " " + status);
    }
    public void printStatus(){
        System.out.println(address + " " + status);
    }
}
