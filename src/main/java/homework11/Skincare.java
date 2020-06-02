package homework11;

public class Skincare {
    private String brand;
    private String typeOfSkin;
    private String purpose;
    public Skincare(String b,String t,String p){
        brand=b;
        typeOfSkin=t;
        purpose=p;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void  setTypeOfSkin(String typeOfSkin){
        this.typeOfSkin = typeOfSkin;
    }
    public void setPurpose(String purpose){
        this.purpose=purpose;
    }
public String getBrand (){
        return brand;
}
public String getTypeOfSkin(){
        return typeOfSkin;
}
public String getPurpose(String agefighting){
        return purpose;
}
    public void printClass() {
        System.out.println("Brand = " + brand + "\nType of skin = " + typeOfSkin + "\n" + "Purpose = " + purpose);
    }
        public Skincare(){
    }
}
