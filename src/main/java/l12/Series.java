package l12;

public class Series {

    private String name;
    private Genres genre;
    private int year;
    private String mainActor;
    private int budget;

    public Series(String name, Genres genre, int year, String mainActor, int budget) {
        this.name = name;
        this.genre = genre;
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

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
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
        System.out.println("Movie name: " + getName() + ". Movie genre: " + getGenre() + ". Movie year: " + getYear()+ ". Movie main actor: " + getMainActor() + ". Movie budget: " + getBudget());
    }
}
