package home11;

public class Movie {
    private String title;
    private String genre;
    private int time;
    private String country;

    public Movie(){
    }

    public Movie(String title,String genre,int time,String country){
        this.title=title;
        this.genre=genre;
        this.time=time;
        this.country=country;
    }

    public String gettitle(){
        return title;
    }

    public String getgenre() {
        return genre;
    }

    public int gettime() {
        return time;
    }

    public String getcountry() {
        return country;
    }
    public void settitle(String title){
        this.title=title;
    }
    public void setgenre(String genre){
        this.genre=genre;
    }
    public void settime(int time){
        this.time=time;
    }
    public void setcountry(String country){
        this.country=country;
    }
    public void printOut(){
        System.out.println("Yesterday we watched a movie " + title+" this movie was "+genre+" it went "+time+" " + "min, released it "+country+", it was very interesting!");
    }
}
