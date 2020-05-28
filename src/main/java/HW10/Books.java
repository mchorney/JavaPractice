package HW10;

public class Books {
    public String name;
    public String type;
    public String author;
    public double rating;
    public double price;

    public void printMe(){
        if(rating>4){
            System.out.println("We recommend you this book:");
        } else {
            System.out.println("Rating is less then 4, read at your own risk ");
        }
        System.out.println("Name = " +name);
        System.out.println("Type = " +type);
        System.out.println("Author = " +author);
        System.out.println("Rating = " +rating);
        System.out.println("Price = " +price);
        System.out.println("************************");

    }
}
