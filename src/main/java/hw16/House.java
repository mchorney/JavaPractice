package hw16;

public class House {

    private String area;
    private int year;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public House(String area, int year) {
        this.area = area;
        this.year = year;

    }

    void printInfo (){
        System.out.println("Area "+ area + " Year" + year);
    }

    @Override
    public String toString() {
        return "House{" +
                "area='" + area + '\'' +
                ", year=" + year +
                '}';
    }
}
