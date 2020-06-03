package hwLesson11_1;

public class Googles {
    private String brand;
    private String[] gender;
    private int price;

    public Googles(){}

    public Googles(String brand,String[] gender, int price){
        this.brand =brand;
        this.gender = gender;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String[] getGender() {
        return gender;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setGender(String[] gender) {
        this.gender = gender;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public  void  printClass(){
        for (String v:this.gender){
            System.out.println("************ Googles *****************");
            System.out.println("Googles Brand =" +brand);
            System.out.println("Google are for = " +v);
            System.out.println("Googles price = " + price);

        }
        System.out.println("************ END of Googles *****************");


    }

}
