package hw17;

public class Brand {

    private String name;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Brand(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
