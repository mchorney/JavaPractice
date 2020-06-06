package hw15;

public class SparklingWine extends Wine implements Beverages {
    private String name;
    private int year;
    private int price;

    public SparklingWine(String name, int year, int godviderzhki, int price) {
        super(name, year, godviderzhki, price);
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public void  SparklingWine() {
        System.out.println("Semi Sweet Red interface implemented for Beverages ");

    }
}
