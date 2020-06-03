package hw14;

public class Supermarket {
    protected String name;
    protected City city;
    protected int openYear;

    public Supermarket(String name, City city, int openYear) {
        this.name = name;
        this.city = city;
        this.openYear = openYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getOpenYear() {
        return openYear;
    }

    public void setOpenYear(int openYear) {
        this.openYear = openYear;
    }

    public void invitationInfo(String folkName){
        System.out.println("Hi everyone! Our Supermarket: "+'"'+ name+'"'+" ."+folkName+" is opened in "+ openYear+".");
    }

@Override
    public String toString() {
        return "Supermarket{" +
                "name='" + name + '\'' +
                ", city=" + city +
                ", openYear=" + openYear +
                '}';
    }
}
