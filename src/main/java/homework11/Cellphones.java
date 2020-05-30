package homework11;

public class Cellphones {
private String model;
private int year;
private String country;

public Cellphones(){}

public Cellphones(String mod,int y,String cntr){
    model=mod;
    year=y;
    country=cntr;

}
public String getModel(){
    return model;
}
public String getCountry(){
    return country;
}

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void printclass(){
        System.out.println("Cellphone "+model+" developed in "+country+" in "+year);
    }
}
