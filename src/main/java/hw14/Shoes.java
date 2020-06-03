package hw14;

public class Shoes {
    protected String Brand;
    protected Size size;
    protected ForWho gender;
    protected Season season;
    protected int price;

    public Shoes(String brand, Size size, ForWho gender, Season season, int price) {
        Brand = brand;
        this.size = size;
        this.gender = gender;
        this.season = season;
        this.price = price;
    }


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public ForWho getGender() {
        return gender;
    }

    public void setGender(ForWho gender) {
        this.gender = gender;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void printMe(){
        System.out.println("Shoes{" +
                "Brand='" + Brand + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", season=" + season +
                ", price=$" + price +
                '}');
    }


}
