package l12;

public class App {
    public static void main(String[] args) {


        Movie funnyMovie = new Movie("Police Acadamy", new Genres[]{Genres.ACTION, Genres.CRIME, Genres.DRAMA}, 2018, "Rober Kiosaky", 28000000);
        funnyMovie.fullInfo();

        Series strangerThings = new Series("Strange things", Genres.FANTASY, 2020, "David Harbour", 254800000);
        strangerThings.fullInfo();

    }
}
