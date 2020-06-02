package hwlesson10;

public class House {
    public String zipCode;
    public int sqrfeet;
    public double numRooms;
    public double price;

    public void printMe(){
        System.out.println("*********** Class House *******");
        System.out.println("Zip Code = " + zipCode);
        System.out.println("sqrFeet = " + sqrfeet);
        System.out.println("Number of Rooms in House =" +numRooms);
        System.out.println("Price of the House = $" + price);
        System.out.println("*********** Class House *******");
    }
}
