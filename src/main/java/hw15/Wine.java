package hw15;

public class Wine extends Cognac implements Beverages {

    private String name;
    private int year;
    private int price;

    public Wine(String name, int year, int godviderzhki, int price) {
        super(name, year, godviderzhki, price);
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public void semiSweetRed() {
        System.out.println("Semi Sweet Red interface implemented for Beverages ");

    }
}
