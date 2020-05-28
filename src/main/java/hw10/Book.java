package hw10;

public class Book {
    public String name;
    public String author;
    public double size;
    public int year;

    public void bookYear() {
        System.out.println('"' + name + '"' + " has been written by " + author + " in " + year + ".");
    }

    public void bookSize() {
        System.out.println('"' + name + '"' + " has been written by " + author + " and it has " + size + " pages.");
    }
}
