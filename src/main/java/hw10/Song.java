package hw10;

public class Song {
    public String title;
    public int year;
    public String genre;

    public void listen() {
        System.out.println("You are listening " + title + "  enjoy!");
    }

    public void download() {
        System.out.println("You're currently downloading " + title);
    }
}
