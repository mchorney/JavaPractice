package hw12;

import java.util.Arrays;

public class movies {
    private String brand;
    private String cinema;
    private Zhaner[] zhaner;

    public movies(String brand, String cinema,Zhaner[] zhaner) {
        this.brand = brand;
        this.cinema = cinema;
        this.zhaner = zhaner;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }

    public void setZhaner(hw12.Zhaner[] zhaner) {
        this.zhaner = zhaner;
    }

    public String getBrand() {
        return brand;
    }

    public String getCinema() {
        return cinema;
    }

    public hw12.Zhaner[] getZhaner() {
        return zhaner;
    }
    @Override
    public  String toString(){
        return "computer{"+
                "brand"+  brand +'\''+"Zhaner" + Arrays.toString(zhaner)
                + "cinema '" +cinema +'\''+'}';
    }
}
