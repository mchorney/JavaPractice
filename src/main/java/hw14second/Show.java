package hw14second;

public class Show extends Film {
    private String Seasons;
    private Genre genre;


    public Show(String name, String producer, int year, String seasons, Genre genre ) {
        super(name, producer, year);
        Seasons = seasons;
        this.genre = genre;

    }

    public String getSeasons() {
        return Seasons;
    }

    public void setSeasons(String seasons) {
        Seasons = seasons;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;

    }
    public void printMe(){
        System.out.println( " The movie " + name + " By Producer "+ producer + " was released in" + year + ". This is great " + genre + "!" );

    }

}
