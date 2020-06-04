package hw14second;

public class Animation extends Film {
    private Genre genre;
    private String seasons;

    public Animation(String name, String producer, int year, Genre genre, String seasons) {
        super(name, producer, year);
        this.genre = genre;
        this.seasons = seasons;

    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }


    public void Info() {
        System.out.println("Animation{" +
                "genre=" + genre +
                ", seasons='" + seasons + '\'' +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                '}');
    }
}
