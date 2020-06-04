package hw14second;

public class Movie extends Film {
    private Genre genre;
    private String cast;

    public Movie(String name, String producer, int year, Genre genre, String cast) {
        super(name, producer, year);
        this.genre = genre;
        this.cast = cast;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public void printMe(){
        System.out.println("Movie " + name + " By Producer "+ producer + " was released in " + year + ". This is great " + genre + " with " + cast + " in a cast!" );
    }

}
