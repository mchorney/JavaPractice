package l12;

import java.util.Arrays;

public class Movie {

    private String name;
    private Genres[] genres;
    private int year;
    private String mainActor;
    private int budget;

    public Movie(String name, Genres[] genres, int year, String mainActor, int budget) {
        this.name = name;
        this.genres = genres;
        this.year = year;
        this.mainActor = mainActor;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genres[] getGenres() {
        return genres;
    }

    public void setGenres(Genres[] genres) {
        this.genres = genres;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void fullInfo() {
        System.out.println("Movie name: " + getName() + ". Movie genre: " + Arrays.toString(getGenres()) + ". Movie year: " + getYear()+ ". Movie main actor: " + getMainActor() + ". Movie budget: " + getBudget());
    }

}
