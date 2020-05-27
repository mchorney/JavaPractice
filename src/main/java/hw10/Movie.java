package hw10;

public class Movie {
    public String title;
    public int year;
    public String genre;

    public void watch() {
        System.out.println("You're watching " + title + " movie, enjoy!");
    }

    public void download(double GB) {
        System.out.println("You're currently downloading " + title);
    }
}
