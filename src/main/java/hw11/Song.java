package hw11;

public class Song {
    private String title;
    private String artist;
    private int year;
    private String genre;

    public Song() {
    }

    public Song(String title,String artist, int year, String genre) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public void printClass() {
        System.out.println("Title of the song: " + title + "\n" +
                "Artist of the song: " + artist + "\n" +
                "Year of the song: " + year + "\n" +
                "Genre of the song: " + genre);
    }
}
