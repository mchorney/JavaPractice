package hw11;

public class Bicycle {
    private String brand;
    private String type;
    private String gender;
    private int price;

    public Bicycle(){};

    public Bicycle(String brand,String type,String gender,int price){
        this.brand=brand;
        this.gender=gender;
        this.type=type;
        this.price=price;
    }

    public Bicycle(String brand,String type,int price){
        this.brand=brand;
        this.price=price;
        this.type=type;
    }

    public Bicycle(String b,int p,String g){
        brand=b;
        gender=g;
        price=p;
    }

    public Bicycle(String b,int p){
        brand=b;
        price=p;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public String getGender() {
        return gender;
    }

    public String getType() {
        return type;
    }

    public void printOut(){
        System.out.println("Brand = "+brand+"\nType = "+type+"\nGender = "+gender+"\nPrice = $"+price);
    }

}
