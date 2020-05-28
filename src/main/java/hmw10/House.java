package hmw10;

public class House {
    public String size;
    public int numOfRooms;
    double price;

    public void buyHouse(int numOfRooms, double price){
        this.numOfRooms=numOfRooms;
        this.price = price;
    }

    public void sellHouse(){
        System.out.println("Your house was sold for $" + this.getPrice(this.numOfRooms));
    }

    public String getSize(){
        if (this.numOfRooms <= 3){
            return "small";
        }else {
            return "big";
        }
    }

    public int getRooms(){
        return this.numOfRooms;
    }

    public double getPrice(){
        return this.price;
    }

    public double getPrice(int numOfRooms){
        switch (numOfRooms){
            case 1: return 100000;
            case 2: return 200000;
            case 3: return 300000;
            case 4: return 400000;
            case 5: return 500000;
            default: return 600000;
        }
    }
}
