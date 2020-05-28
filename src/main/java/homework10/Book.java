package homework10;

public class Book {

    public String book_name;
    public String book_author;
    public int page_amount;
    public String cover_material;
    public int publicationDate;
    public String publisher;
    public String autograph_of_author;

    public void showBooksWithLeatherCover(String cover_material) {

        if (cover_material == "leather") {
            System.out.println(book_name);
        }
    }
    public int pages_amount() {
        return page_amount;
    }
}
