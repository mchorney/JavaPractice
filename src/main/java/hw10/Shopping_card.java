package hw10;

public class Shopping_card {
    public String size;
    public String total_price;
    public int number_of_products;
    public String name_of_store;

    public void printIt() {
        System.out.println("size = " + size);
        System.out.println("total_price = " + total_price);
        System.out.println("number_of_products = " + number_of_products);
        System.out.println("name_of_store = " + name_of_store);

    }
    public void shopping(){
        System.out.println("When i order something in "+name_of_store+ "," + " i usually spend at least "+total_price);
    }
}
