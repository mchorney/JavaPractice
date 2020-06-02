package lesson11hw10;

public class Mobilephones {
    private String[]names;
    private String nametoo;
    private String brand;
    private int releaseYear;

    public Mobilephones(String[] name, String brand, int releaseYear) {
        this.names = name;
        this.nametoo = nametoo;
        this.brand = brand;
        this.releaseYear = releaseYear;

    }

    public Mobilephones() {
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String getNametoo() {
        return nametoo;
    }

    public void setNametoo(String nametoo) {
        this.nametoo = nametoo;
    }

    public String getBrands() {
        return brand;
    }

    public void setBrands(String brands) {
        this.brand = brands;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public void printClass(){
        System.out.println("brand="+brand);
        System.out.println("release year="+releaseYear);
        System.out.println(nametoo);
        for (String names:this.names) {
            System.out.println(names);

        }


    }
}
