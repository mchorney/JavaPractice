package homework10;

public class App {

    public static void main(String[] args) {

        BankAccount customer1 = new BankAccount();
        customer1.customer_name = "Matthew Olson";
        customer1.account_number = 0003333444556;
        customer1.account_balance = 500000.0;
        customer1.account_creation_date = "2001-01-01";

        Double balance = customer1.check_balance();
        System.out.println(balance);
        customer1.showMyBankStatement();
        System.out.println("Balance before deposit of 1000$: " + "\n" + balance);
        customer1.deposit(1000.0);
        System.out.println("Balance after deposit: " + "\n" + customer1.deposit(1000.0));

        BankAccount customer2 = new BankAccount();

        customer2.customer_name = "Natalia Olson";
        customer2.account_number = 0003333344756;
        customer2.account_balance = 200000.0;
        customer2.account_creation_date = "2003-01-01";

        Double balance1 = customer2.check_balance();
        System.out.println(balance1);
        customer2.showMyBankStatement();
        System.out.println("Balance before deposit of 10000$: " + "\n" + balance);
        customer2.deposit(1000.0);
        System.out.println("Balance after deposit: " + "\n" + customer2.deposit(1000.0));

        Triangle triangle1 = new Triangle();

        System.out.println("Area of triangle1 = " + triangle1.AreaTriangle(20.0, 110.5));
        boolean compare_triangle1 = triangle1.compareTriangles(3, 3, 3);

        if (compare_triangle1 == true) {
            System.out.println("Triangle is equilateral");
        } else {
            System.out.println("Triangel is not equilateral");
        }

        Triangle triangle2 = new Triangle();

        System.out.println("Area of triangle2 = " + triangle1.AreaTriangle(10.0, 200.5));
        boolean compare_triangle2 = triangle2.compareTriangles(3, 5, 3);
        System.out.println(compare_triangle2);

        if (compare_triangle2 == true) {
            System.out.println("Triangle is equilateral");
        } else {
            System.out.println("Triangel is not equilateral");
        }

        Book book1 = new Book();
        book1.book_name = "The Adventures of Robinson Crusoe";
        book1.book_author = "Daniel Defoe";
        book1.cover_material = "leather";
        book1.page_amount = 300;
        book1.publisher = "W. Taylor at the Ship and Black-Swan in Paternaster Row,, London";
        book1.publicationDate = 1719;
        book1.autograph_of_author = "none";

        System.out.println("Page amount of " + book1.book_name + " is " + book1.pages_amount());
        book1.showBooksWithLeatherCover("leather");


        Book book2 = new Book();
        book2.book_name = "On the Origin of species";
        book2.cover_material = "paper";
        book2.page_amount = 500;
        book2.publisher = "JOHN MURRAY, ALBEMARLE STREET, LONDON";
        book2.publicationDate = 1858;
        book2.autograph_of_author = "none";

        System.out.println("Page amount of " + book2.book_name + " is " + book2.pages_amount());
        book2.showBooksWithLeatherCover("paper");


        MusicPlayer mp = new MusicPlayer();
        mp.playSong("song1");
        mp.playSong("song33");
        mp.decrease_volume();
        for (int i = 0; i < 10; i++) {
            mp.increase_volume();
        }
    }
}
