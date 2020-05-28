package homework10;

public class Book {

    String book_name;
    String book_author;
    String note;
    int page_amount;
    String cover_material;
    int publicationDate;
    String publisher;
    String autograph_of_author;

    public void showBooksWithLeatherCover(String cover_material) {

        if (cover_material == "leather") {
            System.out.println(book_name);
        }
    }

    public int pages_amount() {
        return page_amount;
    }
}
